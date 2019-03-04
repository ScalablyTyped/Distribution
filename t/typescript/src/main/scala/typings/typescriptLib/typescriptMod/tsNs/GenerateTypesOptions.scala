package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTypesOptions extends js.Object {
  val file: java.lang.String
  val fileToGenerateTypesFor: java.lang.String
  val outputFileName: java.lang.String
}

object GenerateTypesOptions {
  @scala.inline
  def apply(file: java.lang.String, fileToGenerateTypesFor: java.lang.String, outputFileName: java.lang.String): GenerateTypesOptions = {
    val __obj = js.Dynamic.literal(file = file, fileToGenerateTypesFor = fileToGenerateTypesFor, outputFileName = outputFileName)
  
    __obj.asInstanceOf[GenerateTypesOptions]
  }
}

