package typings.winrt.Windows.UI.StartScreen

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecondaryTileFactory extends js.Object {
  def createTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ): SecondaryTile
  def createWideTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ): SecondaryTile
  def createWithId(tileId: String): SecondaryTile
}

object ISecondaryTileFactory {
  @scala.inline
  def apply(
    createTile: (String, String, String, String, TileOptions, Uri) => SecondaryTile,
    createWideTile: (String, String, String, String, TileOptions, Uri, Uri) => SecondaryTile,
    createWithId: String => SecondaryTile
  ): ISecondaryTileFactory = {
    val __obj = js.Dynamic.literal(createTile = js.Any.fromFunction6(createTile), createWideTile = js.Any.fromFunction7(createWideTile), createWithId = js.Any.fromFunction1(createWithId))
    __obj.asInstanceOf[ISecondaryTileFactory]
  }
}

