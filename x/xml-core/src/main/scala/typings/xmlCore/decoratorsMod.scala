package typings.xmlCore

import typings.xmlCore.typesMod.XmlAttributeType
import typings.xmlCore.typesMod.XmlChildElementType
import typings.xmlCore.typesMod.XmlContentType
import typings.xmlCore.typesMod.XmlElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("xml-core/dist/types/decorators", "XmlAttribute")
  @js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("xml-core/dist/types/decorators", "XmlAttribute")
  @js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("xml-core/dist/types/decorators", "XmlChildElement")
  @js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  @JSImport("xml-core/dist/types/decorators", "XmlChildElement")
  @js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  
  @JSImport("xml-core/dist/types/decorators", "XmlContent")
  @js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("xml-core/dist/types/decorators", "XmlContent")
  @js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("xml-core/dist/types/decorators", "XmlElement")
  @js.native
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
}
