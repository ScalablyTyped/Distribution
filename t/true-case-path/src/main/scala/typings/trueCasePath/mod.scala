package typings.trueCasePath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("true-case-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def trueCasePath(filePath: String): js.Promise[String] = js.native
  def trueCasePath(filePath: String, basePath: String): js.Promise[String] = js.native
  def trueCasePathSync(filePath: String): String = js.native
  def trueCasePathSync(filePath: String, basePath: String): String = js.native
}

