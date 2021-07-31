package typings.xmlCore

import typings.xmlCore.typesMod.XmlAttributeType
import typings.xmlCore.typesMod.XmlChildElementType
import typings.xmlCore.typesMod.XmlContentType
import typings.xmlCore.typesMod.XmlElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("xml-core/dist/types/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlAttribute")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlAttribute")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlChildElement")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit]]
  @scala.inline
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlChildElement")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit]]
  
  @scala.inline
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlContent")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlContent")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlElement")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
}
