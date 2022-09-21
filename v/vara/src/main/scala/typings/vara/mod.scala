package typings.vara

import org.scalablytyped.runtime.StringDictionary
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.vara.anon.BreakPoints
import typings.vara.anon.X
import typings.vara.anon.XY
import typings.vara.anon.Y
import typings.vara.varaBooleans.`false`
import typings.vara.varaStrings.center
import typings.vara.varaStrings.left
import typings.vara.varaStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof VaraType` */
  @JSImport("vara", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VaraType {
    def this(queryDom: String, fontJSONSource: String, textStep: js.Array[TextStep]) = this()
    def this(
      queryDom: String,
      fontJSONSource: String,
      textStep: js.Array[TextStep],
      textGlobals: TextProperties
    ) = this()
  }
  
  trait TextElements extends StObject {
    
    /**
      * Array of svg g elements, each representing a letter
      */
    var characters: js.Array[SVGGElement]
    
    /**
      * Svg g wrapping the text block
      */
    var container: SVGGElement
  }
  object TextElements {
    
    inline def apply(characters: js.Array[SVGGElement], container: SVGGElement): TextElements = {
      val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextElements]
    }
    
    extension [Self <: TextElements](x: Self) {
      
      inline def setCharacters(value: js.Array[SVGGElement]): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setCharactersVarargs(value: SVGGElement*): Self = StObject.set(x, "characters", js.Array(value*))
      
      inline def setContainer(value: SVGGElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextProperties extends StObject {
    
    /**
      * Whether to animate the text automatically
      */
    var autoAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color of the text
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Duration of the animation in milliseconds
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the text
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Space between each character
      */
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the animation should be in a queue
      */
    var queued: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width / Thickness of the stroke
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Text align, accepted values are left,center,right
      */
    var textAlign: js.UndefOr[left | center | right] = js.undefined
  }
  object TextProperties {
    
    inline def apply(): TextProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProperties]
    }
    
    extension [Self <: TextProperties](x: Self) {
      
      inline def setAutoAnimation(value: Boolean): Self = StObject.set(x, "autoAnimation", value.asInstanceOf[js.Any])
      
      inline def setAutoAnimationUndefined: Self = StObject.set(x, "autoAnimation", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
      
      inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  trait TextStep
    extends StObject
       with TextProperties {
    
    /**
      * Delay before the animation starts in milliseconds
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the x or y coordinate should be from its calculated position,
      * ie the position if x or y coordinates were not applied
      */
    var fromCurrentPosition: js.UndefOr[X] = js.undefined
    
    /**
      * String or integer, for if animations are called manually or when using the get() method.
      * Default is the index of the object.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Text to be shown
      */
    var text: String
    
    /**
      * x coordinate of the text
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * y coordinate of the text
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object TextStep {
    
    inline def apply(text: String): TextStep = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextStep]
    }
    
    extension [Self <: TextStep](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFromCurrentPosition(value: X): Self = StObject.set(x, "fromCurrentPosition", value.asInstanceOf[js.Any])
      
      inline def setFromCurrentPositionUndefined: Self = StObject.set(x, "fromCurrentPosition", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* was `typeof VaraType` */
  type Vara = VaraType
  
  @js.native
  trait VaraType extends StObject {
    
    def analyseWidth(): BreakPoints = js.native
    
    def animate(element: SVGElement, duration: Double, delay: Double, `final`: Double): Unit = js.native
    
    /**
      * Used to execute a function once animation ends, triggers every time a block of text is drawn.
      *
      * @param onEnd callback with the id of the drawn text, and an object containing the group DOM object,
      * this is the same object that is returned when calling the get() method.
      */
    def animationEnd(onEnd: js.Function2[/* id */ String | Double, /* group */ TextElements, Unit]): Unit = js.native
    
    def createNode(noneName: String, properties: StringDictionary[String]): SVGElement = js.native
    
    def createText(): Unit = js.native
    
    /**
      * Used to animate texts with autoAnimation:false
      * If an id was given to the text during creation, it should be given as the argument.
      * Otherwise use the index of the text block.
      *
      * @param id text ID or index
      * @param duration
      */
    def draw(id: String): Unit = js.native
    def draw(id: String, duration: Double): Unit = js.native
    def draw(id: Double): Unit = js.native
    def draw(id: Double, duration: Double): Unit = js.native
    
    /**
      * If an id was given to the text during creation, it should be given as the argument.
      * Otherwise use the index of the text block.
      *
      * @param id text ID or index
      */
    def get(id: String): TextElements | `false` = js.native
    def get(id: Double): TextElements | `false` = js.native
    
    def getSVGData(): Unit = js.native
    
    def getSectionPathLength(id: String): Double = js.native
    def getSectionPathLength(id: Double): Double = js.native
    
    /**
      * Is used to play the animation of every text block, obeying delay and queue.
      */
    def playAll(): Unit = js.native
    
    def preCreate(): Unit = js.native
    
    /**
      * Is used to execute a function when the font is loaded and the elements are created.
      * ! Any other method should be called inside the function !
      *
      * @param onReady callback
      */
    def ready(onReady: js.Function0[Unit]): Unit = js.native
    
    def setPosition(element: SVGGElement, obj: Y): Unit = js.native
    def setPosition(element: SVGGElement, obj: Y, relative: XY): Unit = js.native
  }
}
