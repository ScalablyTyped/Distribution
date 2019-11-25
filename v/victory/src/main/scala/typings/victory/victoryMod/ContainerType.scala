package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.victory.victoryStrings.brush
  - typings.victory.victoryStrings.cursor
  - typings.victory.victoryStrings.selection
  - typings.victory.victoryStrings.voronoi
  - typings.victory.victoryStrings.zoom
*/
trait ContainerType extends js.Object

object ContainerType {
  @scala.inline
  def brush: typings.victory.victoryStrings.brush = this.cast("brush")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cursor: typings.victory.victoryStrings.cursor = this.cast("cursor")
  @scala.inline
  def selection: typings.victory.victoryStrings.selection = this.cast("selection")
  @scala.inline
  def voronoi: typings.victory.victoryStrings.voronoi = this.cast("voronoi")
  @scala.inline
  def zoom: typings.victory.victoryStrings.zoom = this.cast("zoom")
}

