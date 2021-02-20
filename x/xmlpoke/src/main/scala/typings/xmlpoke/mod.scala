package typings.xmlpoke

import org.scalablytyped.runtime.Instantiable1
import typings.xmlpoke.XmlPoke.API
import typings.xmlpoke.XmlPoke.XmlValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlpoke", JSImport.Namespace)
  @js.native
  def apply(xml: String, modify: js.Function1[/* api */ API, Unit]): String = js.native
  
  @JSImport("xmlpoke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("xmlpoke", "CDataValue")
  @js.native
  class CDataValue protected ()
    extends typings.xmlpoke.XmlPoke.CDataValue {
    def this(value: String) = this()
  }
  @JSImport("xmlpoke", "CDataValue")
  @js.native
  def CDataValue: Instantiable1[/* value */ String, typings.xmlpoke.XmlPoke.CDataValue] = js.native
  @scala.inline
  def CDataValue_=(x: Instantiable1[/* value */ String, typings.xmlpoke.XmlPoke.CDataValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDataValue")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("xmlpoke", "XmlString")
  @js.native
  class XmlString protected () extends XmlValue {
    def this(value: String) = this()
  }
  @JSImport("xmlpoke", "XmlString")
  @js.native
  def XmlString: Instantiable1[/* value */ String, XmlValue] = js.native
  @scala.inline
  def XmlString_=(x: Instantiable1[/* value */ String, XmlValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlString")(x.asInstanceOf[js.Any])
}
