package typings.tetherShepherd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TetherShepherd {
  
  @js.native
  trait IShepherdTour
    extends Instantiable0[IShepherdTour]
       with Instantiable1[/* options */ IShepherdTourOptions, IShepherdTour] {
    
    def addStep(id: String, options: IShepherdTourStep): IShepherdTour = js.native
    /**
      * Creates a new Step object with options, and returns the Tour object for convenient chaining when creating multiple steps. If you'd like you can also just pass an options hash which includes id as a key. If the options hash doesn't include an id, one will be generated. You can also pass an existing Step instance rather than options, but note that Shepherd does not support a Step being attached to multiple Tours.
      */
    def addStep(id: String, options: IShepherdTourStepOptions): IShepherdTour = js.native
    
    /**
      * Show the previous step, in the order they were added
      */
    def back(): Unit = js.native
    
    /**
      * Trigger cancel on the current step, hiding it without advancing
      */
    def cancel(): Unit = js.native
    
    /**
      * Return a step with a specific id
      */
    def getById(id: String): IShepherdTourStep = js.native
    
    /**
      * Returns the currently shown step
      */
    def getCurrentStep(): IShepherdTourStep = js.native
    
    /**
      * Hide the current step
      */
    def hide(): Unit = js.native
    
    /**
      * Advance to the next step, in the order they were added
      */
    def next(): Unit = js.native
    
    /**
      * Unbind an event
      */
    def off(eventName: String): js.Any = js.native
    def off(eventName: String, handler: js.Function): js.Any = js.native
    
    /**
      * Bind an event
      */
    def on(eventName: String, handler: js.Function): js.Any = js.native
    def on(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
    
    /**
      * Bind just the next instance of an event
      */
    def once(eventName: String, handler: js.Function): js.Any = js.native
    def once(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
    
    /**
      * Show the step specified by id (if it's a string), or index (if it's a number) provided. Defaults to the first step.
      */
    def show(): Unit = js.native
    def show(id: String): Unit = js.native
    def show(id: Double): Unit = js.native
    
    /**
      * Show the first step and begin the tour
      */
    def start(): Unit = js.native
  }
  
  @js.native
  trait IShepherdTourAttachProperties extends StObject {
    
    var element: String = js.native
    
    var on: String = js.native
  }
  object IShepherdTourAttachProperties {
    
    @scala.inline
    def apply(element: String, on: String): IShepherdTourAttachProperties = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShepherdTourAttachProperties]
    }
    
    @scala.inline
    implicit class IShepherdTourAttachPropertiesMutableBuilder[Self <: IShepherdTourAttachProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShepherdTourButton extends StObject {
    
    var action: js.UndefOr[js.Function] = js.native
    
    var classes: js.UndefOr[String] = js.native
    
    var events: js.UndefOr[IShepherdTourButtonEventHash] = js.native
    
    var text: String = js.native
  }
  object IShepherdTourButton {
    
    @scala.inline
    def apply(text: String): IShepherdTourButton = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShepherdTourButton]
    }
    
    @scala.inline
    implicit class IShepherdTourButtonMutableBuilder[Self <: IShepherdTourButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setEvents(value: IShepherdTourButtonEventHash): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type IShepherdTourButtonEventHash = StringDictionary[js.Function]
  
  @js.native
  trait IShepherdTourOptions extends StObject {
    
    var defaults: js.UndefOr[IShepherdTourStepOptions] = js.native
    
    var steps: js.UndefOr[js.Array[IShepherdTourStep]] = js.native
  }
  object IShepherdTourOptions {
    
    @scala.inline
    def apply(): IShepherdTourOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShepherdTourOptions]
    }
    
    @scala.inline
    implicit class IShepherdTourOptionsMutableBuilder[Self <: IShepherdTourOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IShepherdTourStepOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[IShepherdTourStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: IShepherdTourStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IShepherdTourStep extends StObject {
    
    /**
      * Hide this step and trigger the cancel event
      */
    def cancel(): Unit = js.native
    
    /**
      * Hide this step and trigger the complete event
      */
    def complete(): Unit = js.native
    
    /**
      * Remove the element
      */
    def destroy(): Unit = js.native
    
    /**
      * Hide this step
      */
    def hide(): Unit = js.native
    
    /**
      * Returns true if the step is currently shown
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Unbind an event
      */
    def off(eventName: String): js.Any = js.native
    def off(eventName: String, handler: js.Function): js.Any = js.native
    
    /**
      * Bind an event
      */
    def on(eventName: String, handler: js.Function): js.Any = js.native
    def on(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
    
    /**
      * Bind just the next instance of an event
      */
    def once(eventName: String, handler: js.Function): js.Any = js.native
    def once(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
    
    /**
      * Scroll to this step's element
      */
    def scrollTo(): Unit = js.native
    
    /**
      * Show this step
      */
    def show(): Unit = js.native
  }
  
  @js.native
  trait IShepherdTourStepOptions extends StObject {
    
    var advanceOn: js.UndefOr[js.Any] = js.native
    
    var attachTo: js.UndefOr[js.Any] = js.native
    
    var beforeShowPromise: js.UndefOr[js.Any] = js.native
    
    var buttons: js.UndefOr[js.Array[IShepherdTourButton]] = js.native
    
    var classes: js.UndefOr[String] = js.native
    
    var scrollTo: js.UndefOr[Boolean] = js.native
    
    var showCancelLink: js.UndefOr[Boolean] = js.native
    
    var showOn: js.UndefOr[js.Function0[Boolean]] = js.native
    
    // TODO: Tie this in with the tether.d.ts
    var tetherOptions: js.UndefOr[js.Any] = js.native
    
    var text: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var when: js.UndefOr[js.Any] = js.native
  }
  object IShepherdTourStepOptions {
    
    @scala.inline
    def apply(): IShepherdTourStepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShepherdTourStepOptions]
    }
    
    @scala.inline
    implicit class IShepherdTourStepOptionsMutableBuilder[Self <: IShepherdTourStepOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvanceOn(value: js.Any): Self = StObject.set(x, "advanceOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvanceOnUndefined: Self = StObject.set(x, "advanceOn", js.undefined)
      
      @scala.inline
      def setAttachTo(value: js.Any): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      @scala.inline
      def setBeforeShowPromise(value: js.Any): Self = StObject.set(x, "beforeShowPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeShowPromiseUndefined: Self = StObject.set(x, "beforeShowPromise", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[IShepherdTourButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: IShepherdTourButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setScrollTo(value: Boolean): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setShowCancelLink(value: Boolean): Self = StObject.set(x, "showCancelLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelLinkUndefined: Self = StObject.set(x, "showCancelLink", js.undefined)
      
      @scala.inline
      def setShowOn(value: () => Boolean): Self = StObject.set(x, "showOn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
      
      @scala.inline
      def setTetherOptions(value: js.Any): Self = StObject.set(x, "tetherOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTetherOptionsUndefined: Self = StObject.set(x, "tetherOptions", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWhen(value: js.Any): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  @js.native
  trait ShepherdStatic extends StObject {
    
    var Tour: IShepherdTour = js.native
    
    var activeTour: IShepherdTour = js.native
    
    def off(eventName: String): js.Any = js.native
    def off(eventName: String, handler: js.Function): js.Any = js.native
    
    def on(eventName: String, handler: js.Function): js.Any = js.native
    def on(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
    
    def once(eventName: String, handler: js.Function): js.Any = js.native
    def once(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
  }
}
