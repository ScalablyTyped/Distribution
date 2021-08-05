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
    
    inline def apply(): PrimaryGeneratedColumnUUIDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryGeneratedColumnUUIDOptions]
    }
    
    extension [Self <: PrimaryGeneratedColumnUUIDOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
