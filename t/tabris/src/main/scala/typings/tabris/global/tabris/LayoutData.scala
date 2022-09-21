package typings.tabris.global.tabris

import typings.tabris.mod.LayoutDataProperties
import typings.tabris.mod.LayoutDataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.LayoutData")
@js.native
open class LayoutData protected ()
  extends typings.tabris.mod.LayoutData {
  /**
    * Provides layout information for a widget to be used by the parent widget when determining its size
    * and position. See also ${doc:LayoutDataValue}
    */
  def this(parameters: LayoutDataProperties) = this()
}
/* static members */
object LayoutData {
  
  @JSGlobal("tabris.LayoutData")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An instance of LayoutData that centers a widget horizontally and vertically. Equivalent to
    * `LayoutData.from({centerX: 0, centerY: 0})`
    */
  @JSGlobal("tabris.LayoutData.center")
  @js.native
  val center: typings.tabris.mod.LayoutData = js.native
  
  /**
    * Creates a new instance of LayoutData using any valid layoutData expression. For any other value,
    * including `null`, the method throws.
    * @param layoutDataValue The value to create
    */
  inline def from(layoutDataValue: LayoutDataValue): typings.tabris.mod.LayoutData = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(layoutDataValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.LayoutData]
  
  /**
    * A ${doc:SiblingReference} indicating the next widget in the list of children attached to the same
    * parent. Used by the [`baseline`](#baseline) property. An alias of `Constraint.next`.
    */
  @JSGlobal("tabris.LayoutData.next")
  @js.native
  val next: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.next */ Any = js.native
  
  /**
    * A ${doc:SiblingReference} indicating the previous widget in the list of children attached to the same
    * parent. Used by the [`baseline`](#baseline) property. An alias of `Constraint.next`.
    */
  @JSGlobal("tabris.LayoutData.prev")
  @js.native
  val prev: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.prev */ Any = js.native
  
  /**
    * An instance of LayoutData that makes a widget fill the inner width and height of its parent (padding
    * excluded). Equivalent to `LayoutData.from({left: 0, top: 0, right: 0, bottom: 0})`.
    */
  @JSGlobal("tabris.LayoutData.stretch")
  @js.native
  val stretch: typings.tabris.mod.LayoutData = js.native
  
  /**
    * An instance of LayoutData that makes a widget as wide as its parent (padding excluded). Equivalent to
    * `LayoutData.from({left: 0, right: 0})`.
    */
  @JSGlobal("tabris.LayoutData.stretchX")
  @js.native
  val stretchX: typings.tabris.mod.LayoutData = js.native
  
  /**
    * An instance of LayoutData that makes a widget as high as its parent (padding excluded). Equivalent to
    * `LayoutData.from({top: 0, bottom: 0})`.
    */
  @JSGlobal("tabris.LayoutData.stretchY")
  @js.native
  val stretchY: typings.tabris.mod.LayoutData = js.native
}
