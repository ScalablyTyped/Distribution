package typings.xmlCore

import typings.std.Uint8Array
import typings.xmlCore.typesMod.IConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  
  val XmlBase64Converter: IConverter[Uint8Array] = js.native
  
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  
  val XmlNumberConverter: IConverter[Double] = js.native
}
