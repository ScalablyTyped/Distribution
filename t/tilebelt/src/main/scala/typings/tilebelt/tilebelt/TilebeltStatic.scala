package typings.tilebelt.tilebelt

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TilebeltStatic extends js.Object {
  /**
    * Get the smallest tile to cover a bbox
    *
    * @name bboxToTile
    * @param {Array<number>} bbox
    * @returns {Array<number>} tile
    * @example
    * var tile = bboxToTile([ -178, 84, -177, 85 ])
    * //=tile
    */
  def bboxToTile(bbox: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Get the 4 tiles one zoom level higher
    *
    * @name getChildren
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getChildren([5, 10, 10])
    * //=tiles
    */
  def getChildren(tile: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  /**
    * Get the tile one zoom level lower
    *
    * @name getParent
    * @param {Array<number>} tile
    * @returns {Array<number>} tile
    * @example
    * var tile = getParent([5, 10, 10])
    * //=tile
    */
  def getParent(tile: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Get the 3 sibling tiles for a tile
    *
    * @name getSiblings
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getSiblings([5, 10, 10])
    * //=tiles
    */
  def getSiblings(tile: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  /**
    * Check to see if an array of tiles contains a tiles siblings
    *
    * @name hasSiblings
    * @param {Array<number>} tile
    * @param {Array<Array<number>>} tiles
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasSiblings([0, 0, 5], tiles)
    * //=boolean
    */
  def hasSiblings(tile: js.Array[Double], tiles: js.Array[js.Array[Double]]): Boolean = js.native
  /**
    * Check to see if an array of tiles contains a particular tile
    *
    * @name hasTile
    * @param {Array<Array<number>>} tiles
    * @param {Array<number>} tile
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasTile(tiles, [0, 0, 5])
    * //=boolean
    */
  def hasTile(tiles: js.Array[js.Array[Double]], tile: js.Array[Double]): Boolean = js.native
  /**
    * Get the tile for a point at a specified zoom level
    *
    * @name pointToTile
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile
    * @example
    * var tile = pointToTile(1, 1, 20)
    * //=tile
    */
  def pointToTile(lon: Double, lat: Double, z: Double): js.Array[Double] = js.native
  /**
    * Get the precise fractional tile location for a point at a zoom level
    *
    * @name pointToTileFraction
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile fraction
    * var tile = pointToTileFraction(30.5, 50.5, 15)
    * //=tile
    */
  def pointToTileFraction(lon: Double, lat: Double, z: Double): js.Array[Double] = js.native
  /**
    * Get the tile for a quadkey
    *
    * @name quadkeyToTile
    * @param {string} quadkey
    * @returns {Array<number>} tile
    * @example
    * var tile = quadkeyToTile('00001033')
    * //=tile
    */
  def quadkeyToTile(quadkey: String): js.Array[Double] = js.native
  /**
    * Get the bbox of a tile
    *
    * @name tileToBBOX
    * @param {Array<number>} tile
    * @returns {Array<number>} bbox
    * @example
    * var bbox = tileToBBOX([5, 10, 10])
    * //=bbox
    */
  def tileToBBOX(tile: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Get a geojson representation of a tile
    *
    * @name tileToGeoJSON
    * @param {Array<number>} tile
    * @returns {Feature<Polygon>}
    * @example
    * var poly = tileToGeoJSON([5, 10, 10])
    * //=poly
    */
  def tileToGeoJSON(tile: js.Array[Double]): Feature[Polygon, GeoJsonProperties] = js.native
  /**
    * Get the quadkey for a tile
    *
    * @name tileToQuadkey
    * @param {Array<number>} tile
    * @returns {string} quadkey
    * @example
    * var quadkey = tileToQuadkey([0, 1, 5])
    * //=quadkey
    */
  def tileToQuadkey(tile: js.Array[Double]): String = js.native
  /**
    * Check to see if two tiles are the same
    *
    * @name tilesEqual
    * @param {Array<number>} tile1
    * @param {Array<number>} tile2
    * @returns {boolean}
    * @example
    * tilesEqual([0, 1, 5], [0, 0, 5])
    * //=boolean
    */
  def tilesEqual(tile1: js.Array[Double], tile2: js.Array[Double]): Boolean = js.native
}

object TilebeltStatic {
  @scala.inline
  def apply(
    bboxToTile: js.Array[Double] => js.Array[Double],
    getChildren: js.Array[Double] => js.Array[js.Array[Double]],
    getParent: js.Array[Double] => js.Array[Double],
    getSiblings: js.Array[Double] => js.Array[js.Array[Double]],
    hasSiblings: (js.Array[Double], js.Array[js.Array[Double]]) => Boolean,
    hasTile: (js.Array[js.Array[Double]], js.Array[Double]) => Boolean,
    pointToTile: (Double, Double, Double) => js.Array[Double],
    pointToTileFraction: (Double, Double, Double) => js.Array[Double],
    quadkeyToTile: String => js.Array[Double],
    tileToBBOX: js.Array[Double] => js.Array[Double],
    tileToGeoJSON: js.Array[Double] => Feature[Polygon, GeoJsonProperties],
    tileToQuadkey: js.Array[Double] => String,
    tilesEqual: (js.Array[Double], js.Array[Double]) => Boolean
  ): TilebeltStatic = {
    val __obj = js.Dynamic.literal(bboxToTile = js.Any.fromFunction1(bboxToTile), getChildren = js.Any.fromFunction1(getChildren), getParent = js.Any.fromFunction1(getParent), getSiblings = js.Any.fromFunction1(getSiblings), hasSiblings = js.Any.fromFunction2(hasSiblings), hasTile = js.Any.fromFunction2(hasTile), pointToTile = js.Any.fromFunction3(pointToTile), pointToTileFraction = js.Any.fromFunction3(pointToTileFraction), quadkeyToTile = js.Any.fromFunction1(quadkeyToTile), tileToBBOX = js.Any.fromFunction1(tileToBBOX), tileToGeoJSON = js.Any.fromFunction1(tileToGeoJSON), tileToQuadkey = js.Any.fromFunction1(tileToQuadkey), tilesEqual = js.Any.fromFunction2(tilesEqual))
    __obj.asInstanceOf[TilebeltStatic]
  }
  @scala.inline
  implicit class TilebeltStaticOps[Self <: TilebeltStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBboxToTile(value: js.Array[Double] => js.Array[Double]): Self = this.set("bboxToTile", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildren(value: js.Array[Double] => js.Array[js.Array[Double]]): Self = this.set("getChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setGetParent(value: js.Array[Double] => js.Array[Double]): Self = this.set("getParent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSiblings(value: js.Array[Double] => js.Array[js.Array[Double]]): Self = this.set("getSiblings", js.Any.fromFunction1(value))
    @scala.inline
    def setHasSiblings(value: (js.Array[Double], js.Array[js.Array[Double]]) => Boolean): Self = this.set("hasSiblings", js.Any.fromFunction2(value))
    @scala.inline
    def setHasTile(value: (js.Array[js.Array[Double]], js.Array[Double]) => Boolean): Self = this.set("hasTile", js.Any.fromFunction2(value))
    @scala.inline
    def setPointToTile(value: (Double, Double, Double) => js.Array[Double]): Self = this.set("pointToTile", js.Any.fromFunction3(value))
    @scala.inline
    def setPointToTileFraction(value: (Double, Double, Double) => js.Array[Double]): Self = this.set("pointToTileFraction", js.Any.fromFunction3(value))
    @scala.inline
    def setQuadkeyToTile(value: String => js.Array[Double]): Self = this.set("quadkeyToTile", js.Any.fromFunction1(value))
    @scala.inline
    def setTileToBBOX(value: js.Array[Double] => js.Array[Double]): Self = this.set("tileToBBOX", js.Any.fromFunction1(value))
    @scala.inline
    def setTileToGeoJSON(value: js.Array[Double] => Feature[Polygon, GeoJsonProperties]): Self = this.set("tileToGeoJSON", js.Any.fromFunction1(value))
    @scala.inline
    def setTileToQuadkey(value: js.Array[Double] => String): Self = this.set("tileToQuadkey", js.Any.fromFunction1(value))
    @scala.inline
    def setTilesEqual(value: (js.Array[Double], js.Array[Double]) => Boolean): Self = this.set("tilesEqual", js.Any.fromFunction2(value))
  }
  
}

