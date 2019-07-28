package typings.typesettable.buildSrcContextsMod

import typings.std.Element
import typings.std.HTMLElement
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts", "HtmlUtils")
@js.native
class HtmlUtils ()
  extends typings.typesettable.buildSrcContextsHtmlMod.HtmlUtils

/* static members */
@JSImport("typesettable/build/src/contexts", "HtmlUtils")
@js.native
object HtmlUtils extends js.Object {
  /**
    * Adds the variadic classnames to the Element
    */
  def addClasses(element: Element, classNames: String*): Unit = js.native
  /**
    * Appends an HTML element with the specified tag name to the provided element.
    * The variadic classnames are added to the new element.
    *
    * Returns the new element.
    */
  def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
  /**
    * Creates and returns a new HTMLElement with the attached classnames.
    */
  def create(tagName: String, classNames: String*): HTMLElement = js.native
  /**
    * Returns the width/height of HTMLElement's bounding box
    */
  def getDimensions(element: HTMLElement): IDimensions = js.native
}

