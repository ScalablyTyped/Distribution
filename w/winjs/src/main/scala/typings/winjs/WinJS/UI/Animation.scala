package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
**/
object Animation {
  
  //#endregion Functions
  //#region Interfaces
  trait IAnimationMethodResponse extends StObject {
    
    def execute(): Promise[js.Any]
  }
  object IAnimationMethodResponse {
    
    @scala.inline
    def apply(execute: () => Promise[js.Any]): IAnimationMethodResponse = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
      __obj.asInstanceOf[IAnimationMethodResponse]
    }
    
    @scala.inline
    implicit class IAnimationMethodResponseMutableBuilder[Self <: IAnimationMethodResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => Promise[js.Any]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    }
  }
}
