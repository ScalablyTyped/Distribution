package typings.winrtUwp.global.Windows.Graphics

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for working with 3D printers. */
object Printing3D {
  
  /** Creates the 3D printing experience. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
  @js.native
  abstract class Print3DManager ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager
  object Print3DManager {
    
    /**
      * Gets a 3D print manager.
      * @return The 3D print manager.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing3D.Print3DManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager = js.native
    
    /**
      * Programmatically initiates the 3D printing user interface.
      * @return true if the operation completes successfully; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing3D.Print3DManager.showPrintUIAsync")
    @js.native
    def showPrintUIAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Represents a 3D print job. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTask")
  @js.native
  abstract class Print3DTask ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTask
  
  /** Provides data for the Completed event of the 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs")
  @js.native
  abstract class Print3DTaskCompletedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs
  
  /** Specifies the completion status of a 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
  @js.native
  object Print3DTaskCompletion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion with Double] = js.native
    
    /* 0 */ val abandoned: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.abandoned with Double = js.native
    
    /* 1 */ val canceled: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.canceled with Double = js.native
    
    /* 2 */ val failed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.failed with Double = js.native
    
    /* 3 */ val slicing: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.slicing with Double = js.native
    
    /* 4 */ val submitted: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.submitted with Double = js.native
  }
  
  /** Specifies the type of errors encountered during a 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskDetail")
  @js.native
  object Print3DTaskDetail extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail with Double] = js.native
    
    /* 3 */ val invalidMaterialSelection: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidMaterialSelection with Double = js.native
    
    /* 4 */ val invalidModel: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidModel with Double = js.native
    
    /* 6 */ val invalidPrintTicket: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidPrintTicket with Double = js.native
    
    /* 1 */ val modelExceedsPrintBed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.modelExceedsPrintBed with Double = js.native
    
    /* 5 */ val modelNotManifold: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.modelNotManifold with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.unknown with Double = js.native
    
    /* 2 */ val uploadFailed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.uploadFailed with Double = js.native
  }
  
  /** Represents a 3D print job request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequest")
  @js.native
  abstract class Print3DTaskRequest ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequest
  
  /** Provides data for the TaskRequested event. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs")
  @js.native
  abstract class Print3DTaskRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs
  
  /** Provides data for the SourceChanged event. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs")
  @js.native
  abstract class Print3DTaskSourceChangedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs
  
  /** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs")
  @js.native
  abstract class Print3DTaskSourceRequestedArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs
  
  /** Represents a 3D Manufacturing Format (3MF) package. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
  @js.native
  /** Creates a Printing3D3MFPackage object. */
  class Printing3D3MFPackage ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage
  object Printing3D3MFPackage {
    
    /**
      * Creates a Printing3D3MFPackage object from a 3D Manufacturing Format (3MF) file stream.
      * @param value A 3MF file stream.
      * @return A Printing3D3MFPackage created from the specified 3MF package stream.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage.loadAsync")
    @js.native
    def loadAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage] = js.native
  }
  
  /** Represents the base material used for manufacturing certain objects in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial")
  @js.native
  /** Creates an instance of the Printing3DBaseMaterial class. */
  class Printing3DBaseMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterial
  object Printing3DBaseMaterial {
    
    @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the name the acrylonitrile butadiene styrene (ABS) thermoplastic used in the base material. */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial.abs")
    @js.native
    def abs: String = js.native
    @scala.inline
    def abs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abs")(x.asInstanceOf[js.Any])
    
    /** Gets the name the polylactic acid (PLA) thermoplastic used in the base material. */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial.pla")
    @js.native
    def pla: String = js.native
    @scala.inline
    def pla_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pla")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a group of base materials used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup")
  @js.native
  class Printing3DBaseMaterialGroup protected ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup {
    /**
      * Creates an instance of the Printing3DBaseMaterialGroup class.
      * @param MaterialGroupId The identifier for the group of base materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
  }
  
  /** Specifies the format used by the buffer. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DBufferFormat")
  @js.native
  object Printing3DBufferFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat with Double] = js.native
    
    /* 5 */ val printing3DDouble: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.printing3DDouble with Double = js.native
    
    /* 6 */ val printing3DUInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.printing3DUInt with Double = js.native
    
    /* 1 */ val r32G32B32A32Float: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32A32Float with Double = js.native
    
    /* 2 */ val r32G32B32A32UInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32A32UInt with Double = js.native
    
    /* 3 */ val r32G32B32Float: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32Float with Double = js.native
    
    /* 4 */ val r32G32B32UInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32UInt with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.unknown with Double = js.native
  }
  
  /** Represents a color material used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DColorMaterial")
  @js.native
  /** Creates an instance of the Printing3DColorMaterial class. */
  class Printing3DColorMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterial
  
  /** Represents a group of color materials used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DColorMaterialGroup")
  @js.native
  class Printing3DColorMaterialGroup protected ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterialGroup {
    /**
      * Creates an instance of the Printing3DColorMaterialGroup class.
      * @param MaterialGroupId The identifier for the group of color materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
  }
  
  /** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DComponent")
  @js.native
  /** Creates an instance of the Printing3DComponent class. */
  class Printing3DComponent ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent
  
  /** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DComponentWithMatrix")
  @js.native
  /** Creates an instance of the Printing3DComponentWithMatrix class. */
  class Printing3DComponentWithMatrix ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponentWithMatrix
  
  /** Represents a composite material that's defined by a mixture of base materials. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterial")
  @js.native
  /** Creates an instance of the Printing3DCompositeMaterial class. */
  class Printing3DCompositeMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterial
  
  /** Represents a group of composite materials. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup")
  @js.native
  class Printing3DCompositeMaterialGroup protected ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup {
    /**
      * Creates an instance of the Printing3DCompositeMaterialGroup class.
      * @param MaterialGroupId The identifier (ID) of the composite material group; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
  }
  
  /** Represents all material resources in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMaterial")
  @js.native
  /** Creates an instance of the Printing3DMaterial class. */
  class Printing3DMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMaterial
  
  /** Represents a mesh in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMesh")
  @js.native
  /** Creates an instance of the Printing3DMesh class. */
  class Printing3DMesh ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh
  
  /** Specifies how the mesh is verified. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationMode")
  @js.native
  object Printing3DMeshVerificationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode with Double
      ] = js.native
    
    /* 1 */ val findAllErrors: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findAllErrors with Double = js.native
    
    /* 0 */ val findFirstError: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findFirstError with Double = js.native
  }
  
  /** Provides data for the VerifyAsync method. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationResult")
  @js.native
  abstract class Printing3DMeshVerificationResult ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationResult
  
  /** Represents the 3D model in a 3D Manufacturing Format (3MF) package. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModel")
  @js.native
  /** Creates an instance of the Printing3DModel class. */
  class Printing3DModel ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModel
  
  /** Represents a texture used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModelTexture")
  @js.native
  /** Creates an instance of the Printing3DModelTexture class. */
  class Printing3DModelTexture ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture
  
  /** Specifies the units of measure used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModelUnit")
  @js.native
  object Printing3DModelUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit with Double] = js.native
    
    /* 3 */ val centimeter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.centimeter with Double = js.native
    
    /* 5 */ val foot: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.foot with Double = js.native
    
    /* 4 */ val inch: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.inch with Double = js.native
    
    /* 0 */ val meter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.meter with Double = js.native
    
    /* 1 */ val micron: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.micron with Double = js.native
    
    /* 2 */ val millimeter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.millimeter with Double = js.native
  }
  
  /** Represents a combination of properties and/or materials from the material groups specified in ( MaterialGroupIndices ). */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial")
  @js.native
  /** Creates an instance of the Printing3DMultiplePropertyMaterial class. */
  class Printing3DMultiplePropertyMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial
  
  /** Represents a multi-property material group. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup")
  @js.native
  class Printing3DMultiplePropertyMaterialGroup protected ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup {
    /**
      * Creates a new instance of the Printing3DMultiplePropertyMaterialGroup class.
      * @param MaterialGroupId The identifier (ID) of the multi-property material group; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
  }
  
  /** Specifies the function of the object in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DObjectType")
  @js.native
  object Printing3DObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType with Double] = js.native
    
    /* 0 */ val model: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.model with Double = js.native
    
    /* 2 */ val others: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.others with Double = js.native
    
    /* 1 */ val support: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.support with Double = js.native
  }
  
  /** Represents a 2D texture material used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial")
  @js.native
  /** Creates an instance of the Printing3DTexture2CoordMaterial class. */
  class Printing3DTexture2CoordMaterial ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial
  
  /** Represents a group of 2D texture materials used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup")
  @js.native
  class Printing3DTexture2CoordMaterialGroup protected ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup {
    /**
      * Creates a instance of the Printing3DTexture2CoordMaterialGroup class.
      * @param MaterialGroupId The identifier for a group of 2D texture materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
  }
  
  /** Specifies how tiling should occur in the U and V axis in order to fill the overall requested area of a texture. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior")
  @js.native
  object Printing3DTextureEdgeBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior with Double
      ] = js.native
    
    /* 3 */ val clamp: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.clamp with Double = js.native
    
    /* 2 */ val mirror: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.mirror with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.none with Double = js.native
    
    /* 1 */ val wrap: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.wrap with Double = js.native
  }
  
  /** Specifies the texture resource used in a 2D texture material. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureResource")
  @js.native
  /** Creates an instance of the Printing3DTextureResource class. */
  class Printing3DTextureResource ()
    extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource
}
