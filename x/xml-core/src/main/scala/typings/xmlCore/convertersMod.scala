package typings.xmlCore

import typings.xmlCore.typesMod.IConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertersMod {
  
  @JSImport("xml-core/dist/types/converters", "XmlBase64Converter")
  @js.native
  val XmlBase64Converter: IConverter[js.typedarray.Uint8Array] = js.native
  
  @JSImport("xml-core/dist/types/converters", "XmlBooleanConverter")
  @js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  
  @JSImport("xml-core/dist/types/converters", "XmlNumberConverter")
  @js.native
  val XmlNumberConverter: IConverter[Double] = js.native
}
