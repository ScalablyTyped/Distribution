package typings.wordpressAdmin

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.wordpressAdmin.anon.ActivateMode
import typings.wordpressAdmin.anon.Attach
import typings.wordpressAdmin.anon.BindHandlers
import typings.wordpressAdmin.anon.ClassName
import typings.wordpressAdmin.anon.Constructor
import typings.wordpressAdmin.anon.Extend
import typings.wordpressAdmin.anon.Id
import typings.wordpressAdmin.anon.Text
import typings.wordpressAdmin.wpBackboneMod.WpBackBoneView
import typings.wordpressAdmin.wpBackboneMod.WpBackboneSubviews
import typings.wordpressAdmin.wpBackboneMod.WpBackboneViewList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaViewsMod {
  
  type Frame = StateMachine & View & ActivateMode
  
  trait FrameClasses extends StObject {
    
    def select(): Extend
    @JSName("select")
    var select_Original: MediaFrameSelect
  }
  object FrameClasses {
    
    inline def apply(select: MediaFrameSelect): FrameClasses = {
      val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameClasses]
    }
    
    extension [Self <: FrameClasses](x: Self) {
      
      inline def setSelect(value: MediaFrameSelect): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameOptions extends StObject {
    
    var button: js.UndefOr[Text] = js.undefined
    
    // frame?: FrameType;
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FrameOptions {
    
    inline def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameOptions]
    }
    
    extension [Self <: FrameOptions](x: Self) {
      
      inline def setButton(value: Text): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressAdmin.wordpressAdminStrings.select
    - typings.wordpressAdmin.wordpressAdminStrings.post
    - typings.wordpressAdmin.wordpressAdminStrings.manage
    - typings.wordpressAdmin.wordpressAdminStrings.image
    - typings.wordpressAdmin.wordpressAdminStrings.audio
    - typings.wordpressAdmin.wordpressAdminStrings.video
    - typings.wordpressAdmin.wordpressAdminStrings.`edit-attachments`
  */
  trait FrameType extends StObject
  object FrameType {
    
    inline def audio: typings.wordpressAdmin.wordpressAdminStrings.audio = "audio".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.audio]
    
    inline def `edit-attachments`: typings.wordpressAdmin.wordpressAdminStrings.`edit-attachments` = "edit-attachments".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.`edit-attachments`]
    
    inline def image: typings.wordpressAdmin.wordpressAdminStrings.image = "image".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.image]
    
    inline def manage: typings.wordpressAdmin.wordpressAdminStrings.manage = "manage".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.manage]
    
    inline def post: typings.wordpressAdmin.wordpressAdminStrings.post = "post".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.post]
    
    inline def select: typings.wordpressAdmin.wordpressAdminStrings.select = "select".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.select]
    
    inline def video: typings.wordpressAdmin.wordpressAdminStrings.video = "video".asInstanceOf[typings.wordpressAdmin.wordpressAdminStrings.video]
  }
  
  type MediaFrame = Frame & Attach
  
  type MediaFrameSelect = MediaFrame & BindHandlers
  
  @js.native
  trait Region extends Model[Any, ModelSetOptions, Any] {
    
    /**
      * Get the region's view.
      */
    def get(): View = js.native
    
    /**
      * Activate a mode.
      */
    def mode(mode: String): Region = js.native
    
    var options: js.UndefOr[Id] = js.native
    
    /**
      * Render a mode.
      */
    def render(mode: String): Region = js.native
    
    /**
      * Set the region's view as a subview of the frame.
      */
    def set(views: WpBackboneViewList, options: Any): WpBackboneSubviews = js.native
    
    /**
      * Trigger regional view events on the frame.
      */
    def trigger(event: Any): Region = js.native
  }
  
  @js.native
  trait State extends Model[Any, ModelSetOptions, Any] {
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def ready(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait StateMachine extends StObject {
    
    def apply(): Extend = js.native
    
    /**
      * Returns the previous active state.
      *
      * Call the `state()` method with no parameters to retrieve the current
      * active state.
      */
    def lastState(): State = js.native
    
    def off(event: String, callback: js.Function1[/* repeated */ Any, Unit]): StateMachine = js.native
    
    def on(event: String, callback: js.Function1[/* repeated */ Any, Unit]): StateMachine = js.native
    
    /**
      * Sets the active state.
      *
      * Bail if we're trying to select the current state, if we haven't
      * created the `states` collection, or are trying to select a state
      * that does not exist.
      */
    def setState(id: String): StateMachine = js.native
    
    /**
      * Fetch a state.
      *
      * If no `id` is provided, returns the active state.
      *
      * Implicitly creates states.
      *
      * Ensure that the `states` collection exists so the `StateMachine`
      * can be used as a mixin.
      */
    def state(): State = js.native
    def state(id: String): State = js.native
    
    def trigger(event: String, args: Any*): StateMachine = js.native
  }
  
  type UploaderWindow = View & ClassName
  
  type View = WpBackBoneView & Constructor
}
