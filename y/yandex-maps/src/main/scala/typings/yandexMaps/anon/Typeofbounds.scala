package typings.yandexMaps.anon

import typings.yandexMaps.mod.IProjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbounds extends StObject {
  
  def areIntersecting(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]]): Boolean = js.native
  def areIntersecting(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]], projection: IProjection): Boolean = js.native
  
  def containsBounds(outer: js.Array[js.Array[Double]], inner: js.Array[js.Array[Double]]): Boolean = js.native
  def containsBounds(outer: js.Array[js.Array[Double]], inner: js.Array[js.Array[Double]], projection: IProjection): Boolean = js.native
  
  def containsPoint(bounds: js.Array[js.Array[Double]], point: js.Array[Double]): Boolean = js.native
  def containsPoint(bounds: js.Array[js.Array[Double]], point: js.Array[Double], projection: IProjection): Boolean = js.native
  
  def fromBounds(sourceBounds: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  def fromBounds(sourceBounds: js.Array[js.Array[js.Array[Double]]], projection: IProjection): js.Array[js.Array[Double]] = js.native
  
  def fromGlobalPixelBounds(pixelBounds: js.Array[js.Array[Double]], zoom: Double): js.Array[js.Array[Double]] = js.native
  def fromGlobalPixelBounds(pixelBounds: js.Array[js.Array[Double]], zoom: Double, projection: IProjection): js.Array[js.Array[Double]] = js.native
  
  def fromPoints(points: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  def fromPoints(points: js.Array[js.Array[Double]], projection: IProjection): js.Array[js.Array[Double]] = js.native
  
  def getCenter(bounds: js.Array[js.Array[Double]]): js.Array[Double] = js.native
  def getCenter(bounds: js.Array[js.Array[Double]], projection: IProjection): js.Array[Double] = js.native
  
  def getCenterAndZoom(bounds: js.Array[js.Array[Double]], containerSize: js.Array[Double]): Center = js.native
  def getCenterAndZoom(
    bounds: js.Array[js.Array[Double]],
    containerSize: js.Array[Double],
    projection: Unit,
    params: Inscribe
  ): Center = js.native
  def getCenterAndZoom(bounds: js.Array[js.Array[Double]], containerSize: js.Array[Double], projection: IProjection): Center = js.native
  def getCenterAndZoom(
    bounds: js.Array[js.Array[Double]],
    containerSize: js.Array[Double],
    projection: IProjection,
    params: Inscribe
  ): Center = js.native
  
  def getIntersections(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]]): js.Array[js.Array[js.Array[Double]]] = js.native
  def getIntersections(bounds1: js.Array[js.Array[Double]], bounds2: js.Array[js.Array[Double]], projection: IProjection): js.Array[js.Array[js.Array[Double]]] = js.native
  
  def getSize(bounds: js.Array[js.Array[Double]]): js.Array[Double] = js.native
  def getSize(bounds: js.Array[js.Array[Double]], projection: IProjection): js.Array[Double] = js.native
  
  def toGlobalPixelBounds(geoBounds: js.Array[js.Array[Double]], zoom: Double): js.Array[js.Array[Double]] = js.native
  def toGlobalPixelBounds(geoBounds: js.Array[js.Array[Double]], zoom: Double, projection: IProjection): js.Array[js.Array[Double]] = js.native
}
