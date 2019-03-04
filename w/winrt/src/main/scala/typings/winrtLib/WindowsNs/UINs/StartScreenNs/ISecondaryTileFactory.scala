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
    createTile: js.Function6[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      TileOptions, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      SecondaryTile
    ],
    createWideTile: js.Function7[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      TileOptions, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      SecondaryTile
    ],
    createWithId: js.Function1[java.lang.String, SecondaryTile]
  ): ISecondaryTileFactory = {
    val __obj = js.Dynamic.literal(createTile = createTile, createWideTile = createWideTile, createWithId = createWithId)
  
    __obj.asInstanceOf[ISecondaryTileFactory]
  }
}

