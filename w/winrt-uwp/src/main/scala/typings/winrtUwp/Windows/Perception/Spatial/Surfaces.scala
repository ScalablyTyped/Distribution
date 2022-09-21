package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surfaces {
  
  trait SpatialSurfaceInfo extends StObject {
    
    var id: Any
    
    /* unmapped type */
    var tryComputeLatestMeshAsync: Any
    
    /* unmapped type */
    var tryGetBounds: Any
    
    /* unmapped type */
    var updateTime: Any
  }
  object SpatialSurfaceInfo {
    
    inline def apply(id: Any, tryComputeLatestMeshAsync: Any, tryGetBounds: Any, updateTime: Any): SpatialSurfaceInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tryComputeLatestMeshAsync = tryComputeLatestMeshAsync.asInstanceOf[js.Any], tryGetBounds = tryGetBounds.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceInfo]
    }
    
    extension [Self <: SpatialSurfaceInfo](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTryComputeLatestMeshAsync(value: Any): Self = StObject.set(x, "tryComputeLatestMeshAsync", value.asInstanceOf[js.Any])
      
      inline def setTryGetBounds(value: Any): Self = StObject.set(x, "tryGetBounds", value.asInstanceOf[js.Any])
      
      inline def setUpdateTime(value: Any): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpatialSurfaceMesh extends StObject {
    
    var coordinateSystem: Any
    
    /* unmapped type */
    var surfaceInfo: Any
    
    /* unmapped type */
    var triangleIndices: Any
    
    /* unmapped type */
    var vertexNormals: Any
    
    /* unmapped type */
    var vertexPositionScale: Any
    
    /* unmapped type */
    var vertexPositions: Any
  }
  object SpatialSurfaceMesh {
    
    inline def apply(
      coordinateSystem: Any,
      surfaceInfo: Any,
      triangleIndices: Any,
      vertexNormals: Any,
      vertexPositionScale: Any,
      vertexPositions: Any
    ): SpatialSurfaceMesh = {
      val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any], surfaceInfo = surfaceInfo.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexPositionScale = vertexPositionScale.asInstanceOf[js.Any], vertexPositions = vertexPositions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMesh]
    }
    
    extension [Self <: SpatialSurfaceMesh](x: Self) {
      
      inline def setCoordinateSystem(value: Any): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
      
      inline def setSurfaceInfo(value: Any): Self = StObject.set(x, "surfaceInfo", value.asInstanceOf[js.Any])
      
      inline def setTriangleIndices(value: Any): Self = StObject.set(x, "triangleIndices", value.asInstanceOf[js.Any])
      
      inline def setVertexNormals(value: Any): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      inline def setVertexPositionScale(value: Any): Self = StObject.set(x, "vertexPositionScale", value.asInstanceOf[js.Any])
      
      inline def setVertexPositions(value: Any): Self = StObject.set(x, "vertexPositions", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpatialSurfaceMeshBuffer extends StObject {
    
    var data: Any
    
    /* unmapped type */
    var elementCount: Any
    
    /* unmapped type */
    var format: Any
    
    /* unmapped type */
    var stride: Any
  }
  object SpatialSurfaceMeshBuffer {
    
    inline def apply(data: Any, elementCount: Any, format: Any, stride: Any): SpatialSurfaceMeshBuffer = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elementCount = elementCount.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMeshBuffer]
    }
    
    extension [Self <: SpatialSurfaceMeshBuffer](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElementCount(value: Any): Self = StObject.set(x, "elementCount", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setStride(value: Any): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpatialSurfaceMeshOptions extends StObject {
    
    /* unmapped type */
    var includeVertexNormals: Any
    
    /* unmapped type */
    var triangleIndexFormat: Any
    
    /* unmapped type */
    var vertexNormalFormat: Any
    
    /* unmapped type */
    var vertexPositionFormat: Any
  }
  object SpatialSurfaceMeshOptions {
    
    inline def apply(
      includeVertexNormals: Any,
      triangleIndexFormat: Any,
      vertexNormalFormat: Any,
      vertexPositionFormat: Any
    ): SpatialSurfaceMeshOptions = {
      val __obj = js.Dynamic.literal(includeVertexNormals = includeVertexNormals.asInstanceOf[js.Any], triangleIndexFormat = triangleIndexFormat.asInstanceOf[js.Any], vertexNormalFormat = vertexNormalFormat.asInstanceOf[js.Any], vertexPositionFormat = vertexPositionFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMeshOptions]
    }
    
    extension [Self <: SpatialSurfaceMeshOptions](x: Self) {
      
      inline def setIncludeVertexNormals(value: Any): Self = StObject.set(x, "includeVertexNormals", value.asInstanceOf[js.Any])
      
      inline def setTriangleIndexFormat(value: Any): Self = StObject.set(x, "triangleIndexFormat", value.asInstanceOf[js.Any])
      
      inline def setVertexNormalFormat(value: Any): Self = StObject.set(x, "vertexNormalFormat", value.asInstanceOf[js.Any])
      
      inline def setVertexPositionFormat(value: Any): Self = StObject.set(x, "vertexPositionFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpatialSurfaceObserver extends StObject {
    
    /* unmapped type */
    var addEventListener: Any
    
    /* unmapped type */
    var getObservedSurfaces: Any
    
    /* unmapped type */
    var onobservedsurfaceschanged: Any
    
    /* unmapped type */
    var removeEventListener: Any
    
    /* unmapped type */
    var setBoundingVolume: Any
    
    /* unmapped type */
    var setBoundingVolumes: Any
  }
  object SpatialSurfaceObserver {
    
    inline def apply(
      addEventListener: Any,
      getObservedSurfaces: Any,
      onobservedsurfaceschanged: Any,
      removeEventListener: Any,
      setBoundingVolume: Any,
      setBoundingVolumes: Any
    ): SpatialSurfaceObserver = {
      val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getObservedSurfaces = getObservedSurfaces.asInstanceOf[js.Any], onobservedsurfaceschanged = onobservedsurfaceschanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setBoundingVolume = setBoundingVolume.asInstanceOf[js.Any], setBoundingVolumes = setBoundingVolumes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceObserver]
    }
    
    extension [Self <: SpatialSurfaceObserver](x: Self) {
      
      inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
      
      inline def setGetObservedSurfaces(value: Any): Self = StObject.set(x, "getObservedSurfaces", value.asInstanceOf[js.Any])
      
      inline def setOnobservedsurfaceschanged(value: Any): Self = StObject.set(x, "onobservedsurfaceschanged", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
      
      inline def setSetBoundingVolume(value: Any): Self = StObject.set(x, "setBoundingVolume", value.asInstanceOf[js.Any])
      
      inline def setSetBoundingVolumes(value: Any): Self = StObject.set(x, "setBoundingVolumes", value.asInstanceOf[js.Any])
    }
  }
}
