package typings.xadesjs.xadesjsMod.xml

import typings.xadesjs.xadesjsStrings.OIDAsURI
import typings.xadesjs.xadesjsStrings.OIDAsURN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.Identifier")
@js.native
class Identifier () extends XadesObject {
  var Qualifier: OIDAsURI | OIDAsURN = js.native
  var Value: String = js.native
}

