package typings
package xsdDashSchemaDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xsd-schema-validator", JSImport.Namespace)
@js.native
object xsdDashSchemaDashValidatorMod extends js.Object {
  def validateXML(
    xml: java.lang.String,
    pathToXsd: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ xsdDashSchemaDashValidatorLib.Anon_Messages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validateXML(
    xml: nodeLib.NodeJSNs.ReadableStream,
    pathToXsd: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ xsdDashSchemaDashValidatorLib.Anon_Messages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validateXML(
    xml: xsdDashSchemaDashValidatorLib.Anon_File,
    pathToXsd: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ xsdDashSchemaDashValidatorLib.Anon_Messages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

