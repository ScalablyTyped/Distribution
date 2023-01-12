package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesTabsMod.Tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesCommandsMod {
  
  object Commands {
    
    trait Command extends StObject {
      
      /**
        * The Extension Command description
        * Optional.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the Extension Command
        * Optional.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The shortcut active for this command, or blank if not active.
        * Optional.
        */
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
    
    trait Static extends StObject {
      
      /**
        * Returns all the registered extension commands for this extension and their shortcut (if active).
        *
        * @returns Called to return the registered commands.
        */
      def getAll(): js.Promise[js.Array[Command]]
      
      /**
        * Fired when a registered command is activated using a keyboard shortcut.
        *
        * @param command
        * @param tab Optional.
        */
      var onCommand: Event[js.Function2[/* command */ String, /* tab */ js.UndefOr[Tab], Unit]]
      
      /**
        * Reset a command's details to what is specified in the manifest.
        *
        * @param name The name of the command.
        */
      def reset(name: String): js.Promise[Unit]
      
      /**
        * Update the details of an already defined command.
        *
        * @param detail The new description for the command.
        */
      def update(detail: UpdateDetailType): js.Promise[Unit]
    }
    object Static {
      
      inline def apply(
        getAll: () => js.Promise[js.Array[Command]],
        onCommand: Event[js.Function2[/* command */ String, /* tab */ js.UndefOr[Tab], Unit]],
        reset: String => js.Promise[Unit],
        update: UpdateDetailType => js.Promise[Unit]
      ): Static = {
        val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll), onCommand = onCommand.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), update = js.Any.fromFunction1(update))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setGetAll(value: () => js.Promise[js.Array[Command]]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
        
        inline def setOnCommand(value: Event[js.Function2[/* command */ String, /* tab */ js.UndefOr[Tab], Unit]]): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
        
        inline def setReset(value: String => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
        
        inline def setUpdate(value: UpdateDetailType => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The new description for the command.
      */
    trait UpdateDetailType extends StObject {
      
      /**
        * The new description for the command.
        * Optional.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the command.
        */
      var name: String
      
      /**
        * Optional.
        */
      var shortcut: js.UndefOr[String] = js.undefined
    }
    object UpdateDetailType {
      
      inline def apply(name: String): UpdateDetailType = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateDetailType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UpdateDetailType] (val x: Self) extends AnyVal {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      }
    }
  }
}
