package typings
package winrtLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecondaryTileFactory extends js.Object {
  def createTile(
    tileId: java.lang.String,
    shortName: java.lang.String,
    displayName: java.lang.String,
    arguments: java.lang.String,
    tileOptions: TileOptions,
    logoReference: winrtLib.WindowsNs.FoundationNs.Uri
  ): SecondaryTile
  def createWideTile(
    tileId: java.lang.String,
    shortName: java.lang.String,
    displayName: java.lang.String,
    arguments: java.lang.String,
    tileOptions: TileOptions,
    logoReference: winrtLib.WindowsNs.FoundationNs.Uri,
    wideLogoReference: winrtLib.WindowsNs.FoundationNs.Uri
  ): SecondaryTile
  def createWithId(tileId: java.lang.String): SecondaryTile
}

object ISecondaryTileFactory {
  @scala.inline
  def apply(
    createTile: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, TileOptions, winrtLib.WindowsNs.FoundationNs.Uri) => SecondaryTile,
    createWideTile: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, TileOptions, winrtLib.WindowsNs.FoundationNs.Uri, winrtLib.WindowsNs.FoundationNs.Uri) => SecondaryTile,
    createWithId: java.lang.String => SecondaryTile
  ): ISecondaryTileFactory = {
    val __obj = js.Dynamic.literal(createTile = js.Any.fromFunction6(createTile), createWideTile = js.Any.fromFunction7(createWideTile), createWithId = js.Any.fromFunction1(createWithId))
  
    __obj.asInstanceOf[ISecondaryTileFactory]
  }
}

