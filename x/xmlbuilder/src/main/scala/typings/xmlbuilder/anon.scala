package typings.xmlbuilder

import typings.xmlbuilder.mod.XMLAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[java.lang.String] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[java.lang.String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setVersion(value: java.lang.String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait NData extends StObject {
    
    var nData: js.UndefOr[java.lang.String] = js.undefined
    
    var pubID: js.UndefOr[java.lang.String] = js.undefined
    
    var sysID: js.UndefOr[java.lang.String] = js.undefined
  }
  object NData {
    
    inline def apply(): NData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NData] (val x: Self) extends AnyVal {
      
      inline def setNData(value: java.lang.String): Self = StObject.set(x, "nData", value.asInstanceOf[js.Any])
      
      inline def setNDataUndefined: Self = StObject.set(x, "nData", js.undefined)
      
      inline def setPubID(value: java.lang.String): Self = StObject.set(x, "pubID", value.asInstanceOf[js.Any])
      
      inline def setPubIDUndefined: Self = StObject.set(x, "pubID", js.undefined)
      
      inline def setSysID(value: java.lang.String): Self = StObject.set(x, "sysID", value.asInstanceOf[js.Any])
      
      inline def setSysIDUndefined: Self = StObject.set(x, "sysID", js.undefined)
    }
  }
  
  trait PubID extends StObject {
    
    var pubID: js.UndefOr[java.lang.String] = js.undefined
    
    var sysID: js.UndefOr[java.lang.String] = js.undefined
  }
  object PubID {
    
    inline def apply(): PubID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PubID] (val x: Self) extends AnyVal {
      
      inline def setPubID(value: java.lang.String): Self = StObject.set(x, "pubID", value.asInstanceOf[js.Any])
      
      inline def setPubIDUndefined: Self = StObject.set(x, "pubID", js.undefined)
      
      inline def setSysID(value: java.lang.String): Self = StObject.set(x, "sysID", value.asInstanceOf[js.Any])
      
      inline def setSysIDUndefined: Self = StObject.set(x, "sysID", js.undefined)
    }
  }
  
  trait String extends StObject {
    
    var string: XMLAttribute
  }
  object String {
    
    inline def apply(string: XMLAttribute): String = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      inline def setString(value: XMLAttribute): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
