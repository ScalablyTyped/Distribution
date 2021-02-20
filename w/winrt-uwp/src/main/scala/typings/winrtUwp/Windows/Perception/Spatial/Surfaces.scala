package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surfaces {
  
  @js.native
  trait SpatialSurfaceInfo extends StObject {
    
    var id: js.Any = js.native
    
    /* unmapped type */
    var tryComputeLatestMeshAsync: js.Any = js.native
    
    /* unmapped type */
    var tryGetBounds: js.Any = js.native
    
    /* unmapped type */
    var updateTime: js.Any = js.native
  }
  object SpatialSurfaceInfo {
    
    @scala.inline
    def apply(id: js.Any, tryComputeLatestMeshAsync: js.Any, tryGetBounds: js.Any, updateTime: js.Any): SpatialSurfaceInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tryComputeLatestMeshAsync = tryComputeLatestMeshAsync.asInstanceOf[js.Any], tryGetBounds = tryGetBounds.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceInfo]
    }
    
    @scala.inline
    implicit class SpatialSurfaceInfoMutableBuilder[Self <: SpatialSurfaceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryComputeLatestMeshAsync(value: js.Any): Self = StObject.set(x, "tryComputeLatestMeshAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryGetBounds(value: js.Any): Self = StObject.set(x, "tryGetBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTime(value: js.Any): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpatialSurfaceMesh extends StObject {
    
    var coordinateSystem: js.Any = js.native
    
    /* unmapped type */
    var surfaceInfo: js.Any = js.native
    
    /* unmapped type */
    var triangleIndices: js.Any = js.native
    
    /* unmapped type */
    var vertexNormals: js.Any = js.native
    
    /* unmapped type */
    var vertexPositionScale: js.Any = js.native
    
    /* unmapped type */
    var vertexPositions: js.Any = js.native
  }
  object SpatialSurfaceMesh {
    
    @scala.inline
    def apply(
      coordinateSystem: js.Any,
      surfaceInfo: js.Any,
      triangleIndices: js.Any,
      vertexNormals: js.Any,
      vertexPositionScale: js.Any,
      vertexPositions: js.Any
    ): SpatialSurfaceMesh = {
      val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any], surfaceInfo = surfaceInfo.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexPositionScale = vertexPositionScale.asInstanceOf[js.Any], vertexPositions = vertexPositions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMesh]
    }
    
    @scala.inline
    implicit class SpatialSurfaceMeshMutableBuilder[Self <: SpatialSurfaceMesh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinateSystem(value: js.Any): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceInfo(value: js.Any): Self = StObject.set(x, "surfaceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleIndices(value: js.Any): Self = StObject.set(x, "triangleIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexNormals(value: js.Any): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPositionScale(value: js.Any): Self = StObject.set(x, "vertexPositionScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPositions(value: js.Any): Self = StObject.set(x, "vertexPositions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpatialSurfaceMeshBuffer extends StObject {
    
    var data: js.Any = js.native
    
    /* unmapped type */
    var elementCount: js.Any = js.native
    
    /* unmapped type */
    var format: js.Any = js.native
    
    /* unmapped type */
    var stride: js.Any = js.native
  }
  object SpatialSurfaceMeshBuffer {
    
    @scala.inline
    def apply(data: js.Any, elementCount: js.Any, format: js.Any, stride: js.Any): SpatialSurfaceMeshBuffer = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elementCount = elementCount.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMeshBuffer]
    }
    
    @scala.inline
    implicit class SpatialSurfaceMeshBufferMutableBuilder[Self <: SpatialSurfaceMeshBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementCount(value: js.Any): Self = StObject.set(x, "elementCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStride(value: js.Any): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpatialSurfaceMeshOptions extends StObject {
    
    /* unmapped type */
    var includeVertexNormals: js.Any = js.native
    
    /* unmapped type */
    var triangleIndexFormat: js.Any = js.native
    
    /* unmapped type */
    var vertexNormalFormat: js.Any = js.native
    
    /* unmapped type */
    var vertexPositionFormat: js.Any = js.native
  }
  object SpatialSurfaceMeshOptions {
    
    @scala.inline
    def apply(
      includeVertexNormals: js.Any,
      triangleIndexFormat: js.Any,
      vertexNormalFormat: js.Any,
      vertexPositionFormat: js.Any
    ): SpatialSurfaceMeshOptions = {
      val __obj = js.Dynamic.literal(includeVertexNormals = includeVertexNormals.asInstanceOf[js.Any], triangleIndexFormat = triangleIndexFormat.asInstanceOf[js.Any], vertexNormalFormat = vertexNormalFormat.asInstanceOf[js.Any], vertexPositionFormat = vertexPositionFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceMeshOptions]
    }
    
    @scala.inline
    implicit class SpatialSurfaceMeshOptionsMutableBuilder[Self <: SpatialSurfaceMeshOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeVertexNormals(value: js.Any): Self = StObject.set(x, "includeVertexNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleIndexFormat(value: js.Any): Self = StObject.set(x, "triangleIndexFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexNormalFormat(value: js.Any): Self = StObject.set(x, "vertexNormalFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPositionFormat(value: js.Any): Self = StObject.set(x, "vertexPositionFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpatialSurfaceObserver extends StObject {
    
    /* unmapped type */
    var addEventListener: js.Any = js.native
    
    /* unmapped type */
    var getObservedSurfaces: js.Any = js.native
    
    /* unmapped type */
    var onobservedsurfaceschanged: js.Any = js.native
    
    /* unmapped type */
    var removeEventListener: js.Any = js.native
    
    /* unmapped type */
    var setBoundingVolume: js.Any = js.native
    
    /* unmapped type */
    var setBoundingVolumes: js.Any = js.native
  }
  object SpatialSurfaceObserver {
    
    @scala.inline
    def apply(
      addEventListener: js.Any,
      getObservedSurfaces: js.Any,
      onobservedsurfaceschanged: js.Any,
      removeEventListener: js.Any,
      setBoundingVolume: js.Any,
      setBoundingVolumes: js.Any
    ): SpatialSurfaceObserver = {
      val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getObservedSurfaces = getObservedSurfaces.asInstanceOf[js.Any], onobservedsurfaceschanged = onobservedsurfaceschanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setBoundingVolume = setBoundingVolume.asInstanceOf[js.Any], setBoundingVolumes = setBoundingVolumes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpatialSurfaceObserver]
    }
    
    @scala.inline
    implicit class SpatialSurfaceObserverMutableBuilder[Self <: SpatialSurfaceObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetObservedSurfaces(value: js.Any): Self = StObject.set(x, "getObservedSurfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnobservedsurfaceschanged(value: js.Any): Self = StObject.set(x, "onobservedsurfaceschanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBoundingVolume(value: js.Any): Self = StObject.set(x, "setBoundingVolume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBoundingVolumes(value: js.Any): Self = StObject.set(x, "setBoundingVolumes", value.asInstanceOf[js.Any])
    }
  }
}
