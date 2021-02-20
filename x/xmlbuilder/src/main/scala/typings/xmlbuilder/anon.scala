package typings.xmlbuilder

import typings.xmlbuilder.mod.XMLAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[java.lang.String] = js.native
    
    var standalone: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[java.lang.String] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setVersion(value: java.lang.String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait NData extends StObject {
    
    var nData: js.UndefOr[java.lang.String] = js.native
    
    var pubID: js.UndefOr[java.lang.String] = js.native
    
    var sysID: js.UndefOr[java.lang.String] = js.native
  }
  object NData {
    
    @scala.inline
    def apply(): NData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NData]
    }
    
    @scala.inline
    implicit class NDataMutableBuilder[Self <: NData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNData(value: java.lang.String): Self = StObject.set(x, "nData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNDataUndefined: Self = StObject.set(x, "nData", js.undefined)
      
      @scala.inline
      def setPubID(value: java.lang.String): Self = StObject.set(x, "pubID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubIDUndefined: Self = StObject.set(x, "pubID", js.undefined)
      
      @scala.inline
      def setSysID(value: java.lang.String): Self = StObject.set(x, "sysID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSysIDUndefined: Self = StObject.set(x, "sysID", js.undefined)
    }
  }
  
  @js.native
  trait PubID extends StObject {
    
    var pubID: js.UndefOr[java.lang.String] = js.native
    
    var sysID: js.UndefOr[java.lang.String] = js.native
  }
  object PubID {
    
    @scala.inline
    def apply(): PubID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubID]
    }
    
    @scala.inline
    implicit class PubIDMutableBuilder[Self <: PubID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubID(value: java.lang.String): Self = StObject.set(x, "pubID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubIDUndefined: Self = StObject.set(x, "pubID", js.undefined)
      
      @scala.inline
      def setSysID(value: java.lang.String): Self = StObject.set(x, "sysID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSysIDUndefined: Self = StObject.set(x, "sysID", js.undefined)
    }
  }
  
  @js.native
  trait String extends StObject {
    
    var string: XMLAttribute = js.native
  }
  object String {
    
    @scala.inline
    def apply(string: XMLAttribute): String = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: XMLAttribute): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
