package typings.typestyle.typestyleMod

import typings.std.Record
import typings.typestyle.AnonAutoGenerateTag
import typings.typestyle.typesMod.FontFace
import typings.typestyle.typesMod.KeyFrames
import typings.typestyle.typesMod.NestedCSSProperties
import typings.typestyle.typestyleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle/lib/internal/typestyle", "TypeStyle")
@js.native
class TypeStyle protected () extends js.Object {
  def this(hasAutoGenerateTag: AnonAutoGenerateTag) = this()
  /**
    * Only calls cb all sync operations settle
    */
  var _afterAllSync: js.Any = js.native
  var _autoGenerateTag: js.Any = js.native
  var _freeStyle: js.Any = js.native
  var _getTag: js.Any = js.native
  /**
    * We have a single stylesheet that we update as components register themselves
    */
  var _lastFreeStyleChangeId: js.Any = js.native
  var _pending: js.Any = js.native
  var _pendingRawChange: js.Any = js.native
  var _raw: js.Any = js.native
  /** Checks if the style tag needs updating and if so queues up the change */
  var _styleUpdated: js.Any = js.native
  var _tag: js.UndefOr[js.Any] = js.native
  /**
    * Insert `raw` CSS as a string. This is useful for e.g.
    * - third party CSS that you are customizing with template strings
    * - generating raw CSS in JavaScript
    * - reset libraries like normalize.css that you can use without loaders
    */
  def cssRaw(mustBeValidCSS: String): Unit = js.native
  /**
    * Takes CSSProperties and registers it to a global selector (body, html, etc.)
    */
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
  /**
    * Utility function to register an @font-face
    */
  def fontFace(fontFace: FontFace*): Unit = js.native
  /**
    * Renders styles to the singleton tag imediately
    * NOTE: You should only call it on initial render to prevent any non CSS flash.
    * After that it is kept sync using `requestAnimationFrame` and we haven't noticed any bad flashes.
    **/
  def forceRenderStyles(): Unit = js.native
  /**
    * Allows use to use the stylesheet in a node.js environment
    */
  def getStyles(): String = js.native
  /**
    * Takes keyframes and returns a generated animationName
    */
  def keyframes(frames: KeyFrames): String = js.native
  /**
    * Helps with testing. Reinitializes FreeStyle + raw
    */
  def reinit(): Unit = js.native
  /** Sets the target tag where we write the css on style updates */
  def setStylesTarget(tag: StylesTarget): Unit = js.native
  /**
    * Takes CSSProperties and return a generated className you can use on your component
    */
  def style(objects: js.UndefOr[NestedCSSProperties]*): String = js.native
  @JSName("style")
  def style_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = js.native
  /**
    * Takes an object where property names are ideal class names and property values are CSSProperties, and
    * returns an object where property names are the same ideal class names and the property values are
    * the actual generated class names using the ideal class name as the $debugName
    */
  def stylesheet[Classes /* <: Record[String, NestedCSSProperties] */](classes: Classes): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in keyof Classes ]: string}
    */ typings.typestyle.typestyleStrings.TypeStyle with js.Any = js.native
}

