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

