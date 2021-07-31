package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsPrimaryGeneratedColumnUUIDOptionsMod {
  
  trait PrimaryGeneratedColumnUUIDOptions extends StObject {
    
    /**
      * Column comment. Not supported by all database types.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object PrimaryGeneratedColumnUUIDOptions {
    
    @scala.inline
    def apply(): PrimaryGeneratedColumnUUIDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryGeneratedColumnUUIDOptions]
    }
    
    @scala.inline
    implicit class PrimaryGeneratedColumnUUIDOptionsMutableBuilder[Self <: PrimaryGeneratedColumnUUIDOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
