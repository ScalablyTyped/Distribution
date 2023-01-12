package typings.useEditable

import typings.useEditable.anon.Column
import typings.useEditable.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseEditableMod {
  
  @JSImport("use-editable/dist/types/useEditable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEditable(elementRef: Current, onChange: js.Function2[/* text */ String, /* position */ Position, Unit]): Edit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEditable")(elementRef.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Edit]
  inline def useEditable(
    elementRef: Current,
    onChange: js.Function2[/* text */ String, /* position */ Position, Unit],
    opts: Options
  ): Edit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEditable")(elementRef.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Edit]
  
  @js.native
  trait Edit extends StObject {
    
    /** Returns the current editor state, as usually received in onChange */
    def getState(): typings.useEditable.anon.Position = js.native
    
    /** Inserts new text at the caret position while deleting text in range of the offset (which accepts negative offsets). */
    def insert(append: String): Unit = js.native
    def insert(append: String, offset: Double): Unit = js.native
    
    /** Positions the caret where specified */
    def move(pos: Double): Unit = js.native
    def move(pos: Column): Unit = js.native
    
    /** Replaces the entire content of the editable while adjusting the caret position. */
    def update(content: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indentation: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var content: String
    
    var extent: Double
    
    var line: Double
    
    var position: Double
  }
  object Position {
    
    inline def apply(content: String, extent: Double, line: Double, position: Double): Position = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
