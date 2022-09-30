package typings.xadesjs.mod.xml

import typings.xadesjs.anon.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlXades {
  
  @JSImport("xadesjs", "xml.XmlXades")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xadesjs", "xml.XmlXades.AttributeNames")
  @js.native
  def AttributeNames: Encoding = js.native
  inline def AttributeNames_=(x: Encoding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(x.asInstanceOf[js.Any])
  
  @JSImport("xadesjs", "xml.XmlXades.DefaultPrefix")
  @js.native
  def DefaultPrefix: String = js.native
  inline def DefaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultPrefix")(x.asInstanceOf[js.Any])
  
  @JSImport("xadesjs", "xml.XmlXades.ElementNames")
  @js.native
  def ElementNames: typings.xadesjs.anon.AllDataObjectsTimeStamp = js.native
  inline def ElementNames_=(x: typings.xadesjs.anon.AllDataObjectsTimeStamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementNames")(x.asInstanceOf[js.Any])
  
  /**
    * The XAdES XML namespace URI
    */
  @JSImport("xadesjs", "xml.XmlXades.NamespaceURI")
  @js.native
  def NamespaceURI: String = js.native
  inline def NamespaceURI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(x.asInstanceOf[js.Any])
  
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  @JSImport("xadesjs", "xml.XmlXades.SignedPropertiesType")
  @js.native
  def SignedPropertiesType: String = js.native
  inline def SignedPropertiesType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SignedPropertiesType")(x.asInstanceOf[js.Any])
}
