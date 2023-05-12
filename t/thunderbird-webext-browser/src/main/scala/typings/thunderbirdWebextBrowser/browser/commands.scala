package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  trait Command extends StObject {
    
    /** The Extension Command description */
    var description: js.UndefOr[String] = js.undefined
    
    /** The name of the Extension Command */
    var name: js.UndefOr[String] = js.undefined
    
    /** The shortcut active for this command, or blank if not active. */
    var shortcut: js.UndefOr[String] = js.undefined
  }
  object Command {
    
    inline def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
  
  trait UpdateDetail extends StObject {
    
    /** The description for the command. */
    var description: js.UndefOr[String] = js.undefined
    
    /** The name of the command. */
    var name: String
    
    /**
      * An empty string to clear the shortcut, or a string matching the format
      * defined by the MDN page of the commands API to set a new shortcut key.
      * If the string does not match this format, the function throws an
      * error.
      */
    var shortcut: js.UndefOr[String] = js.undefined
  }
  object UpdateDetail {
    
    inline def apply(name: String): UpdateDetail = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateDetail] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
}
