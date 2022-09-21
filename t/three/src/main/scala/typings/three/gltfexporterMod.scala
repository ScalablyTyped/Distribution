package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.AnimationClip
import typings.three.threeMod.Material
import typings.three.threeMod.Mesh
import typings.three.threeMod.Object3D
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gltfexporterMod {
  
  @JSImport("three/examples/jsm/exporters/GLTFExporter", "GLTFExporter")
  @js.native
  open class GLTFExporter () extends StObject {
    
    def parse(
      input: js.Array[Object3D[Event]],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      onError: js.Function1[/* error */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(
      input: js.Array[Object3D[Event]],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      onError: js.Function1[/* error */ ErrorEvent, Unit],
      options: GLTFExporterOptions
    ): Unit = js.native
    /**
      * Generates a .gltf (JSON) or .glb (binary) output from the input (Scenes or Objects)
      *
      * @param input Scenes or objects to export. Valid options:
      * - Export scenes
      *   ```js
      *   exporter.parse( scene1, ... )
      *   exporter.parse( [ scene1, scene2 ], ... )
      *   ```
      * - Export objects (It will create a new Scene to hold all the objects)
      *   ```js
      *   exporter.parse( object1, ... )
      *   exporter.parse( [ object1, object2 ], ... )
      *   ```
      * - Mix scenes and objects (It will export the scenes as usual but it will create a new scene to hold all the single objects).
      *   ```js
      *   exporter.parse( [ scene1, object1, object2, scene2 ], ... )
      *   ```
      * @param onDone Will be called when the export completes. The argument will be the generated glTF JSON or binary ArrayBuffer.
      * @param onError Will be called if there are any errors during the gltf generation.
      * @param options Export options
      */
    def parse(
      input: Object3D[Event],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      onError: js.Function1[/* error */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(
      input: Object3D[Event],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      onError: js.Function1[/* error */ ErrorEvent, Unit],
      options: GLTFExporterOptions
    ): Unit = js.native
    
    def parseAsync(input: js.Array[Object3D[Event]]): js.Promise[js.typedarray.ArrayBuffer | StringDictionary[Any]] = js.native
    def parseAsync(input: js.Array[Object3D[Event]], options: GLTFExporterOptions): js.Promise[js.typedarray.ArrayBuffer | StringDictionary[Any]] = js.native
    def parseAsync(input: Object3D[Event]): js.Promise[js.typedarray.ArrayBuffer | StringDictionary[Any]] = js.native
    def parseAsync(input: Object3D[Event], options: GLTFExporterOptions): js.Promise[js.typedarray.ArrayBuffer | StringDictionary[Any]] = js.native
    
    def register(callback: js.Function1[/* writer */ GLTFWriter, GLTFExporterPlugin]): this.type = js.native
    
    def unregister(callback: js.Function1[/* writer */ GLTFWriter, GLTFExporterPlugin]): this.type = js.native
  }
  
  @JSImport("three/examples/jsm/exporters/GLTFExporter", "GLTFWriter")
  @js.native
  open class GLTFWriter () extends StObject {
    
    def setPlugins(plugins: js.Array[GLTFExporterPlugin]): Unit = js.native
    
    def write(
      input: js.Array[Object3D[Event]],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit]
    ): js.Promise[Unit] = js.native
    def write(
      input: js.Array[Object3D[Event]],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      options: GLTFExporterOptions
    ): js.Promise[Unit] = js.native
    /**
      * Parse scenes and generate GLTF output
      *
      * @param input Scene or Array of THREE.Scenes
      * @param onDone Callback on completed
      * @param options options
      */
    def write(
      input: Object3D[Event],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit]
    ): js.Promise[Unit] = js.native
    def write(
      input: Object3D[Event],
      onDone: js.Function1[/* gltf */ js.typedarray.ArrayBuffer | StringDictionary[Any], Unit],
      options: GLTFExporterOptions
    ): js.Promise[Unit] = js.native
  }
  
  trait GLTFExporterOptions extends StObject {
    
    /**
      * List of animations to be included in the export.
      */
    var animations: js.UndefOr[js.Array[AnimationClip]] = js.undefined
    
    /**
      * Export in binary (.glb) format, returning an ArrayBuffer. Default is false.
      */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Export with images embedded into the glTF asset. Default is true.
      */
    var embedImages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate indices for non-index geometry and export with them. Default is false.
      */
    var forceIndices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Export custom glTF extensions defined on an object's userData.gltfExtensions property. Default is false.
      */
    var includeCustomExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Restricts the image maximum size (both width and height) to the given value. This option works only if embedImages is true. Default is Infinity.
      */
    var maxTextureSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Export only visible objects. Default is true.
      */
    var onlyVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Export position, rotation and scale instead of matrix per node. Default is false
      */
    var trs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Export just the attributes within the drawRange, if defined, instead of exporting the whole array. Default is true.
      */
    var truncateDrawRange: js.UndefOr[Boolean] = js.undefined
  }
  object GLTFExporterOptions {
    
    inline def apply(): GLTFExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLTFExporterOptions]
    }
    
    extension [Self <: GLTFExporterOptions](x: Self) {
      
      inline def setAnimations(value: js.Array[AnimationClip]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setAnimationsVarargs(value: AnimationClip*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setEmbedImages(value: Boolean): Self = StObject.set(x, "embedImages", value.asInstanceOf[js.Any])
      
      inline def setEmbedImagesUndefined: Self = StObject.set(x, "embedImages", js.undefined)
      
      inline def setForceIndices(value: Boolean): Self = StObject.set(x, "forceIndices", value.asInstanceOf[js.Any])
      
      inline def setForceIndicesUndefined: Self = StObject.set(x, "forceIndices", js.undefined)
      
      inline def setIncludeCustomExtensions(value: Boolean): Self = StObject.set(x, "includeCustomExtensions", value.asInstanceOf[js.Any])
      
      inline def setIncludeCustomExtensionsUndefined: Self = StObject.set(x, "includeCustomExtensions", js.undefined)
      
      inline def setMaxTextureSize(value: Double): Self = StObject.set(x, "maxTextureSize", value.asInstanceOf[js.Any])
      
      inline def setMaxTextureSizeUndefined: Self = StObject.set(x, "maxTextureSize", js.undefined)
      
      inline def setOnlyVisible(value: Boolean): Self = StObject.set(x, "onlyVisible", value.asInstanceOf[js.Any])
      
      inline def setOnlyVisibleUndefined: Self = StObject.set(x, "onlyVisible", js.undefined)
      
      inline def setTrs(value: Boolean): Self = StObject.set(x, "trs", value.asInstanceOf[js.Any])
      
      inline def setTrsUndefined: Self = StObject.set(x, "trs", js.undefined)
      
      inline def setTruncateDrawRange(value: Boolean): Self = StObject.set(x, "truncateDrawRange", value.asInstanceOf[js.Any])
      
      inline def setTruncateDrawRangeUndefined: Self = StObject.set(x, "truncateDrawRange", js.undefined)
    }
  }
  
  trait GLTFExporterPlugin extends StObject {
    
    var afterParse: js.UndefOr[js.Function1[/* input */ Object3D[Event] | js.Array[Object3D[Event]], Unit]] = js.undefined
    
    var beforeParse: js.UndefOr[js.Function1[/* input */ Object3D[Event] | js.Array[Object3D[Event]], Unit]] = js.undefined
    
    var writeMaterial: js.UndefOr[
        js.Function2[/* material */ Material, /* materialDef */ StringDictionary[Any], Unit]
      ] = js.undefined
    
    var writeMesh: js.UndefOr[
        js.Function2[
          /* mesh */ Mesh[
            BufferGeometry, 
            typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
          ], 
          /* meshDef */ StringDictionary[Any], 
          Unit
        ]
      ] = js.undefined
    
    var writeNode: js.UndefOr[
        js.Function2[/* object */ Object3D[Event], /* nodeDef */ StringDictionary[Any], Unit]
      ] = js.undefined
    
    var writeTexture: js.UndefOr[js.Function2[/* map */ Texture, /* textureDef */ StringDictionary[Any], Unit]] = js.undefined
  }
  object GLTFExporterPlugin {
    
    inline def apply(): GLTFExporterPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLTFExporterPlugin]
    }
    
    extension [Self <: GLTFExporterPlugin](x: Self) {
      
      inline def setAfterParse(value: /* input */ Object3D[Event] | js.Array[Object3D[Event]] => Unit): Self = StObject.set(x, "afterParse", js.Any.fromFunction1(value))
      
      inline def setAfterParseUndefined: Self = StObject.set(x, "afterParse", js.undefined)
      
      inline def setBeforeParse(value: /* input */ Object3D[Event] | js.Array[Object3D[Event]] => Unit): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
      
      inline def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
      
      inline def setWriteMaterial(value: (/* material */ Material, /* materialDef */ StringDictionary[Any]) => Unit): Self = StObject.set(x, "writeMaterial", js.Any.fromFunction2(value))
      
      inline def setWriteMaterialUndefined: Self = StObject.set(x, "writeMaterial", js.undefined)
      
      inline def setWriteMesh(
        value: (/* mesh */ Mesh[
              BufferGeometry, 
              typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
            ], /* meshDef */ StringDictionary[Any]) => Unit
      ): Self = StObject.set(x, "writeMesh", js.Any.fromFunction2(value))
      
      inline def setWriteMeshUndefined: Self = StObject.set(x, "writeMesh", js.undefined)
      
      inline def setWriteNode(value: (/* object */ Object3D[Event], /* nodeDef */ StringDictionary[Any]) => Unit): Self = StObject.set(x, "writeNode", js.Any.fromFunction2(value))
      
      inline def setWriteNodeUndefined: Self = StObject.set(x, "writeNode", js.undefined)
      
      inline def setWriteTexture(value: (/* map */ Texture, /* textureDef */ StringDictionary[Any]) => Unit): Self = StObject.set(x, "writeTexture", js.Any.fromFunction2(value))
      
      inline def setWriteTextureUndefined: Self = StObject.set(x, "writeTexture", js.undefined)
    }
  }
}
