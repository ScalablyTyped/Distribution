package typings.wordpressAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.jquery.JQuery
import typings.lodash.mod.TemplateExecutor
import typings.std.HTMLElement
import typings.wordpressAdmin.anon.FnCall
import typings.wordpressAdmin.anon.Silent
import typings.wordpressAdmin.wordpressAdminBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsWpBackboneMod {
  
  @js.native
  trait WpBackBoneView extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    
    def Subviews(view: WpBackBoneView, views: WpBackboneViewList): Unit = js.native
    @JSName("Subviews")
    var Subviews_Original: WpBackboneSubviews = js.native
    
    def extend(): FnCall = js.native
    
    /**
      * Returns the options for this view.
      */
    def prepare(): WpBackBoneViewOptions = js.native
    
    /**
      * Method that is called when the ready event is triggered.
      */
    def ready(): Unit = js.native
  }
  
  trait WpBackBoneViewOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var template: js.UndefOr[TemplateExecutor] = js.undefined
  }
  object WpBackBoneViewOptions {
    
    inline def apply(): WpBackBoneViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WpBackBoneViewOptions]
    }
    
    extension [Self <: WpBackBoneViewOptions](x: Self) {
      
      inline def setTemplate(value: TemplateExecutor): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait WpBackbone extends StObject {
    
    def Subviews(view: WpBackBoneView, views: WpBackboneViewList): Unit
    @JSName("Subviews")
    var Subviews_Original: WpBackboneSubviews
    
    var View: WpBackBoneView
  }
  object WpBackbone {
    
    inline def apply(Subviews: WpBackboneSubviews, View: WpBackBoneView): WpBackbone = {
      val __obj = js.Dynamic.literal(Subviews = Subviews.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
      __obj.asInstanceOf[WpBackbone]
    }
    
    extension [Self <: WpBackbone](x: Self) {
      
      inline def setSubviews(value: WpBackboneSubviews): Self = StObject.set(x, "Subviews", value.asInstanceOf[js.Any])
      
      inline def setView(value: WpBackBoneView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WpBackboneSubviews extends Model[Any, ModelSetOptions, Any] {
    
    def apply(view: WpBackBoneView, views: WpBackboneViewList): Unit = js.native
    
    /**
      * Add subview(s) to existing subviews.
      *
      * An alias to `Views.set()`, which defaults `options.add` to true.
      *
      * Adds any number of `views` to a `selector`.
      *
      * When no `selector` is provided, the root selector (the empty string)
      * is used. `views` accepts a `Backbone.View` instance or an array of
      * `Backbone.View` instances.
      */
    def add(selector: String, views: WpBackboneViewList): WpBackboneSubviews = js.native
    def add(selector: String, views: WpBackboneViewList, options: WpSubViewSetOptions): WpBackboneSubviews = js.native
    
    /**
      * Fetches all of the subviews.
      */
    def all(): js.Array[WpBackBoneView] = js.native
    
    /**
      * Detaches all subviews.
      *
      * Helps to preserve all subview events when re-rendering the master
      * view. Used in conjunction with `Views.render()`.
      */
    def detach(): WpBackboneSubviews = js.native
    
    /**
      * Fetches the first subview that matches a given `selector`.
      *
      * If no `selector` is provided, it will grab the first subview attached to the
      * view's root.
      *
      * Useful when a selector only has one subview at a time.
      *
      * @param selector A jQuery selector.
      */
    def first(selector: String): WpBackBoneView | Null = js.native
    
    /**
      * Fetches all subviews that match a given `selector`.
      *
      * If no `selector` is provided, it will grab all subviews attached
      * to the view's root.
      *
      * @param selector A jQuery selector.
      */
    def get(selector: String): js.UndefOr[WpBackBoneView] = js.native
    
    /**
      * Insert subviews into a selector.
      *
      * By default, appends the subview `els` to the end of the `$target`
      * selector. If `options.at` is set, inserts the subview `els` at the
      * provided index.
      */
    def insert($target: JQuery[HTMLElement], els: String, options: WpSubViewSetOptions): WpBackboneSubviews = js.native
    def insert($target: JQuery[HTMLElement], els: js.Array[HTMLElement], options: WpSubViewSetOptions): WpBackboneSubviews = js.native
    def insert($target: JQuery[HTMLElement], els: HTMLElement, options: WpSubViewSetOptions): WpBackboneSubviews = js.native
    
    /**
      * Triggers the ready event.
      *
      * Only use this method if you know what you're doing. For performance reasons,
      * this method does not check if the view is actually attached to the DOM. It's
      * taking your word for it.
      *
      * Fires the ready event on the current view and all attached subviews.
      */
    def ready(): WpBackboneSubviews = js.native
    
    /**
      * Removes all subviews.
      *
      * Triggers the `remove()` method on all subviews. Detaches the master
      * view from its parent. Resets the internals of the views manager.
      *
      * Accepts an `options` object. If `options.silent` is set, `unset`
      * will *not* be triggered on the master view's parent.
      *
      */
    def remove(options: Silent): WpBackboneSubviews = js.native
    @JSName("remove")
    def remove_false(options: `false`): WpBackboneSubviews = js.native
    
    /**
      * Renders all subviews.
      *
      * Used in conjunction with `Views.detach()`.
      */
    def render(): WpBackboneSubviews = js.native
    
    /**
      * Replaces a selector's subviews
      *
      * By default, sets the `$target` selector's html to the subview `els`.
      *
      * @param $target Selector where to put the elements.
      * @param els HTML or elements to put into the selector's HTML.
      *
      * Can be overridden in subclasses.
      */
    def replace($target: JQuery[HTMLElement], els: String): WpBackboneSubviews = js.native
    def replace($target: JQuery[HTMLElement], els: js.Array[HTMLElement]): WpBackboneSubviews = js.native
    def replace($target: JQuery[HTMLElement], els: HTMLElement): WpBackboneSubviews = js.native
    
    /**
      * Registers subview(s).
      *
      * Registers any number of `views` to a `selector`.
      *
      * When no `selector` is provided, the root selector (the empty string)
      * is used. `views` accepts a `Backbone.View` instance or an array of
      * `Backbone.View` instances.
      */
    def set(selector: String, views: WpBackboneViewList): WpBackboneSubviews = js.native
    def set(selector: String, views: WpBackboneViewList, options: WpSubViewSetOptions): WpBackboneSubviews = js.native
    
    /**
      * Removes an added subview.
      *
      * Stops tracking `views` registered to a `selector`. If no `views` are
      * set, then all of the `selector`'s subviews will be unregistered and
      * removed.
      */
    def unset(selector: String, views: WpBackboneViewList): WpBackboneSubviews = js.native
    def unset(selector: String, views: WpBackboneViewList, options: WpSubViewSetOptions): WpBackboneSubviews = js.native
  }
  
  type WpBackboneViewList = js.Array[WpBackBoneView] | StringDictionary[js.Array[WpBackBoneView]]
  
  trait WpSubViewSetOptions extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
    
    var at: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object WpSubViewSetOptions {
    
    inline def apply(): WpSubViewSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WpSubViewSetOptions]
    }
    
    extension [Self <: WpSubViewSetOptions](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
