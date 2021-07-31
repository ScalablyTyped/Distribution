package typings.superagent

import typings.node.Buffer
import typings.superagent.superagentStrings.auto
import typings.superagent.superagentStrings.basic
import typings.superagent.superagentStrings.bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: bearer
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("bearer")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: bearer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[Double] = js.undefined
    
    var response: js.UndefOr[Double] = js.undefined
  }
  object Deadline {
    
    @scala.inline
    def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    @scala.inline
    implicit class DeadlineMutableBuilder[Self <: Deadline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      @scala.inline
      def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait Passphrase extends StObject {
    
    var passphrase: String
    
    var pfx: String | Buffer
  }
  object Passphrase {
    
    @scala.inline
    def apply(passphrase: String, pfx: String | Buffer): Passphrase = {
      val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passphrase]
    }
    
    @scala.inline
    implicit class PassphraseMutableBuilder[Self <: Passphrase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfx(value: String | Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: basic | auto
  }
  object Type {
    
    @scala.inline
    def apply(`type`: basic | auto): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: basic | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
