package typings.tetherShepherd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TetherShepherd {
  
  @js.native
  trait IShepherdTour
    extends StObject
       with Instantiable0[IShepherdTour]
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
    def off(eventName: String): Any = js.native
    def off(eventName: String, handler: js.Function): Any = js.native
    
    /**
      * Bind an event
      */
    def on(eventName: String, handler: js.Function): Any = js.native
    def on(eventName: String, handler: js.Function, context: Any): Any = js.native
    
    /**
      * Bind just the next instance of an event
      */
    def once(eventName: String, handler: js.Function): Any = js.native
    def once(eventName: String, handler: js.Function, context: Any): Any = js.native
    
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
  
  trait IShepherdTourAttachProperties extends StObject {
    
    var element: String
    
    var on: String
  }
  object IShepherdTourAttachProperties {
    
    inline def apply(element: String, on: String): IShepherdTourAttachProperties = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShepherdTourAttachProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShepherdTourAttachProperties] (val x: Self) extends AnyVal {
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShepherdTourButton extends StObject {
    
    var action: js.UndefOr[js.Function] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var events: js.UndefOr[IShepherdTourButtonEventHash] = js.undefined
    
    var text: String
  }
  object IShepherdTourButton {
    
    inline def apply(text: String): IShepherdTourButton = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShepherdTourButton]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShepherdTourButton] (val x: Self) extends AnyVal {
      
      inline def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setEvents(value: IShepherdTourButtonEventHash): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type IShepherdTourButtonEventHash = StringDictionary[js.Function]
  
  trait IShepherdTourOptions extends StObject {
    
    var defaults: js.UndefOr[IShepherdTourStepOptions] = js.undefined
    
    var steps: js.UndefOr[js.Array[IShepherdTourStep]] = js.undefined
  }
  object IShepherdTourOptions {
    
    inline def apply(): IShepherdTourOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShepherdTourOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShepherdTourOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: IShepherdTourStepOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setSteps(value: js.Array[IShepherdTourStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: IShepherdTourStep*): Self = StObject.set(x, "steps", js.Array(value*))
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
    def off(eventName: String): Any = js.native
    def off(eventName: String, handler: js.Function): Any = js.native
    
    /**
      * Bind an event
      */
    def on(eventName: String, handler: js.Function): Any = js.native
    def on(eventName: String, handler: js.Function, context: Any): Any = js.native
    
    /**
      * Bind just the next instance of an event
      */
    def once(eventName: String, handler: js.Function): Any = js.native
    def once(eventName: String, handler: js.Function, context: Any): Any = js.native
    
    /**
      * Scroll to this step's element
      */
    def scrollTo(): Unit = js.native
    
    /**
      * Show this step
      */
    def show(): Unit = js.native
  }
  
  trait IShepherdTourStepOptions extends StObject {
    
    var advanceOn: js.UndefOr[Any] = js.undefined
    
    var attachTo: js.UndefOr[Any] = js.undefined
    
    var beforeShowPromise: js.UndefOr[Any] = js.undefined
    
    var buttons: js.UndefOr[js.Array[IShepherdTourButton]] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var scrollTo: js.UndefOr[Boolean] = js.undefined
    
    var showCancelLink: js.UndefOr[Boolean] = js.undefined
    
    var showOn: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    // TODO: Tie this in with the tether.d.ts
    var tetherOptions: js.UndefOr[Any] = js.undefined
    
    var text: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var when: js.UndefOr[Any] = js.undefined
  }
  object IShepherdTourStepOptions {
    
    inline def apply(): IShepherdTourStepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShepherdTourStepOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShepherdTourStepOptions] (val x: Self) extends AnyVal {
      
      inline def setAdvanceOn(value: Any): Self = StObject.set(x, "advanceOn", value.asInstanceOf[js.Any])
      
      inline def setAdvanceOnUndefined: Self = StObject.set(x, "advanceOn", js.undefined)
      
      inline def setAttachTo(value: Any): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setBeforeShowPromise(value: Any): Self = StObject.set(x, "beforeShowPromise", value.asInstanceOf[js.Any])
      
      inline def setBeforeShowPromiseUndefined: Self = StObject.set(x, "beforeShowPromise", js.undefined)
      
      inline def setButtons(value: js.Array[IShepherdTourButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: IShepherdTourButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setScrollTo(value: Boolean): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setShowCancelLink(value: Boolean): Self = StObject.set(x, "showCancelLink", value.asInstanceOf[js.Any])
      
      inline def setShowCancelLinkUndefined: Self = StObject.set(x, "showCancelLink", js.undefined)
      
      inline def setShowOn(value: () => Boolean): Self = StObject.set(x, "showOn", js.Any.fromFunction0(value))
      
      inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
      
      inline def setTetherOptions(value: Any): Self = StObject.set(x, "tetherOptions", value.asInstanceOf[js.Any])
      
      inline def setTetherOptionsUndefined: Self = StObject.set(x, "tetherOptions", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWhen(value: Any): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  @js.native
  trait ShepherdStatic extends StObject {
    
    var Tour: IShepherdTour = js.native
    
    var activeTour: IShepherdTour = js.native
    
    def off(eventName: String): Any = js.native
    def off(eventName: String, handler: js.Function): Any = js.native
    
    def on(eventName: String, handler: js.Function): Any = js.native
    def on(eventName: String, handler: js.Function, context: Any): Any = js.native
    
    def once(eventName: String, handler: js.Function): Any = js.native
    def once(eventName: String, handler: js.Function, context: Any): Any = js.native
  }
}
