package typings.xsdSchemaValidator

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.xsdSchemaValidator.anon.File
import typings.xsdSchemaValidator.anon.Messages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xsd-schema-validator", "validateXML")
  @js.native
  def validateXML(
    xml: String,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ Messages, Unit]
  ): Unit = js.native
  @JSImport("xsd-schema-validator", "validateXML")
  @js.native
  def validateXML(
    xml: ReadableStream,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ Messages, Unit]
  ): Unit = js.native
  @JSImport("xsd-schema-validator", "validateXML")
  @js.native
  def validateXML(xml: File, pathToXsd: String, callback: js.Function2[/* err */ Error, /* result */ Messages, Unit]): Unit = js.native
}
