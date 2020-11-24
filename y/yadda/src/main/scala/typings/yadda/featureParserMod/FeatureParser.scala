package typings.yadda.featureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureParser extends js.Object {
  
  def parse(text: String): SpecificationExport = js.native
  def parse(text: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
}
