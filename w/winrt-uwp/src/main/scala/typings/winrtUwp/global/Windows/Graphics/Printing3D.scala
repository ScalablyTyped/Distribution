package typings.winrtUwp.global.Windows.Graphics

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion
import typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail
import typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceRequestedHandler
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferDescription
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for working with 3D printers. */
object Printing3D {
  
  /** Creates the 3D printing experience. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
  @js.native
  abstract class Print3DManager ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager
  object Print3DManager {
    
    @JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a 3D print manager.
      * @return The 3D print manager.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager]
    
    /**
      * Programmatically initiates the 3D printing user interface.
      * @return true if the operation completes successfully; otherwise, false.
      */
    /* static member */
    @scala.inline
    def showPrintUIAsync(): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPrintUIAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  }
  
  /** Represents a 3D print job. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTask")
  @js.native
  abstract class Print3DTask ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTask
  
  /** Provides data for the Completed event of the 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs")
  @js.native
  abstract class Print3DTaskCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs {
    
    /** Gets the status of the 3D print request. */
    /* CompleteClass */
    var completion: Print3DTaskCompletion = js.native
    
    /** Gets the type of error encountered during the 3D print request. */
    /* CompleteClass */
    var extendedStatus: Print3DTaskDetail = js.native
  }
  
  /** Specifies the completion status of a 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
  @js.native
  object Print3DTaskCompletion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion & Double] = js.native
    
    /* 0 */ val abandoned: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.abandoned & Double = js.native
    
    /* 1 */ val canceled: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.canceled & Double = js.native
    
    /* 2 */ val failed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.failed & Double = js.native
    
    /* 3 */ val slicing: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.slicing & Double = js.native
    
    /* 4 */ val submitted: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.submitted & Double = js.native
  }
  
  /** Specifies the type of errors encountered during a 3D print request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskDetail")
  @js.native
  object Print3DTaskDetail extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail & Double] = js.native
    
    /* 3 */ val invalidMaterialSelection: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidMaterialSelection & Double = js.native
    
    /* 4 */ val invalidModel: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidModel & Double = js.native
    
    /* 6 */ val invalidPrintTicket: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.invalidPrintTicket & Double = js.native
    
    /* 1 */ val modelExceedsPrintBed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.modelExceedsPrintBed & Double = js.native
    
    /* 5 */ val modelNotManifold: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.modelNotManifold & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.unknown & Double = js.native
    
    /* 2 */ val uploadFailed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail.uploadFailed & Double = js.native
  }
  
  /** Represents a 3D print job request. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequest")
  @js.native
  abstract class Print3DTaskRequest ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequest {
    
    /**
      * Creates a 3D print job.
      * @param title The name of the print job.
      * @param printerId The identifier of the 3D printer.
      * @param handler The callback for the source of the print job request.
      * @return The 3D print job.
      */
    /* CompleteClass */
    override def createTask(title: String, printerId: String, handler: Print3DTaskSourceRequestedHandler): typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTask = js.native
  }
  
  /** Provides data for the TaskRequested event. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs")
  @js.native
  abstract class Print3DTaskRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs {
    
    /** Gets the 3D print job request associated with the Print3DManager . */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequest = js.native
  }
  
  /** Provides data for the SourceChanged event. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs")
  @js.native
  abstract class Print3DTaskSourceChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs {
    
    /** Gets the updated 3D print package from the workflow. */
    /* CompleteClass */
    var source: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage = js.native
  }
  
  /** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
  @JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs")
  @js.native
  abstract class Print3DTaskSourceRequestedArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs {
    
    /**
      * Specifies the 3D Manufacturing Format (3MF) package to use in the print job.
      * @param source The 3D Manufacturing Format (3MF) package to use in the print job.
      */
    /* CompleteClass */
    override def setSource(source: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage): Unit = js.native
  }
  
  /** Represents a 3D Manufacturing Format (3MF) package. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
  @js.native
  /** Creates a Printing3D3MFPackage object. */
  class Printing3D3MFPackage ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage {
    
    /**
      * Creates a Printing3DModel object from a 3D Manufacturing Format (3MF) file stream.
      * @param value A 3MF file stream.
      * @return A Printing3DModel object created from the specified 3MF object stream.
      */
    /* CompleteClass */
    override def loadModelFromPackageAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModel] = js.native
    
    /** Gets or sets an XML stream to the 3D model in the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var modelPart: IRandomAccessStream = js.native
    
    /** Gets or sets a stream to the print ticket in the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var printTicket: IRandomAccessStream = js.native
    
    /**
      * Saves the Printing3D3MFPackage object to a 3D Manufacturing Format (3MF) file stream.
      * @return A stream to the 3MF file where the package is to be saved.
      */
    /* CompleteClass */
    override def saveAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
    
    /**
      * Saves the specified 3D model to the 3D Manufacturing Format (3MF) package.
      * @param value The 3D model to be saved to the 3MF package.
      * @return The results of the operation.
      */
    /* CompleteClass */
    override def saveModelToPackageAsync(value: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModel): IPromiseWithIAsyncAction = js.native
    
    /** Gets or sets the textures in the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var textures: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource] = js.native
    
    /** Gets or sets a thumbnail image that represents the contents of the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var thumbnail: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource = js.native
  }
  object Printing3D3MFPackage {
    
    @JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Printing3D3MFPackage object from a 3D Manufacturing Format (3MF) file stream.
      * @param value A 3MF file stream.
      * @return A Printing3D3MFPackage created from the specified 3MF package stream.
      */
    /* static member */
    @scala.inline
    def loadAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage]]
  }
  
  /** Represents the base material used for manufacturing certain objects in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterial")
  @js.native
  /** Creates an instance of the Printing3DBaseMaterial class. */
  class Printing3DBaseMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterial {
    
    /** Gets or sets the color of the base material. */
    /* CompleteClass */
    var color: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterial = js.native
    
    /** Gets or sets the name of the base material. */
    /* CompleteClass */
    var name: String = js.native
  }
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
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup {
    /**
      * Creates an instance of the Printing3DBaseMaterialGroup class.
      * @param MaterialGroupId The identifier for the group of base materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
    
    /** Gets a group of base materials used in the 3D model. */
    /* CompleteClass */
    var bases: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterial] = js.native
    
    /** Gets the identifier (ID) of the base material group. */
    /* CompleteClass */
    var materialGroupId: Double = js.native
  }
  
  /** Specifies the format used by the buffer. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DBufferFormat")
  @js.native
  object Printing3DBufferFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat & Double] = js.native
    
    /* 5 */ val printing3DDouble: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.printing3DDouble & Double = js.native
    
    /* 6 */ val printing3DUInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.printing3DUInt & Double = js.native
    
    /* 1 */ val r32G32B32A32Float: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32A32Float & Double = js.native
    
    /* 2 */ val r32G32B32A32UInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32A32UInt & Double = js.native
    
    /* 3 */ val r32G32B32Float: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32Float & Double = js.native
    
    /* 4 */ val r32G32B32UInt: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.r32G32B32UInt & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferFormat.unknown & Double = js.native
  }
  
  /** Represents a color material used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DColorMaterial")
  @js.native
  /** Creates an instance of the Printing3DColorMaterial class. */
  class Printing3DColorMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterial {
    
    /** Gets or sets the color of the material. */
    /* CompleteClass */
    var color: Color = js.native
    
    /** Gets or sets the color value of the material. */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  /** Represents a group of color materials used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DColorMaterialGroup")
  @js.native
  class Printing3DColorMaterialGroup protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterialGroup {
    /**
      * Creates an instance of the Printing3DColorMaterialGroup class.
      * @param MaterialGroupId The identifier for the group of color materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
    
    /** Gets a group of color materials used in the 3D model. */
    /* CompleteClass */
    var colors: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterial] = js.native
    
    /** Gets the identifier (ID) for the color material group. */
    /* CompleteClass */
    var materialGroupId: Double = js.native
  }
  
  /** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DComponent")
  @js.native
  /** Creates an instance of the Printing3DComponent class. */
  class Printing3DComponent ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent {
    
    /** Gets the other components contained within the component. */
    /* CompleteClass */
    var components: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponentWithMatrix] = js.native
    
    /** Gets or sets the 3D mesh of the component. */
    /* CompleteClass */
    var mesh: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh = js.native
    
    /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
    /* CompleteClass */
    var partNumber: String = js.native
    
    /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
    /* CompleteClass */
    var thumbnail: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource = js.native
    
    /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
    /* CompleteClass */
    var `type`: Printing3DObjectType = js.native
  }
  
  /** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DComponentWithMatrix")
  @js.native
  /** Creates an instance of the Printing3DComponentWithMatrix class. */
  class Printing3DComponentWithMatrix ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponentWithMatrix {
    
    /** Gets or sets the 3D Manufacturing Format (3MF) primitive component that's applied to the object definition with a matrix transform. */
    /* CompleteClass */
    var component: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent = js.native
    
    /** Gets or sets the matrix transform that's applied to the 3D Manufacturing Format (3MF) primitive component. */
    /* CompleteClass */
    var matrix: Matrix4x4 = js.native
  }
  
  /** Represents a composite material that's defined by a mixture of base materials. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterial")
  @js.native
  /** Creates an instance of the Printing3DCompositeMaterial class. */
  class Printing3DCompositeMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterial {
    
    /** Gets the mixture of base materials used in the composite material. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1). */
    /* CompleteClass */
    var values: IVector[Double] = js.native
  }
  
  /** Represents a group of composite materials. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup")
  @js.native
  class Printing3DCompositeMaterialGroup protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup {
    /**
      * Creates an instance of the Printing3DCompositeMaterialGroup class.
      * @param MaterialGroupId The identifier (ID) of the composite material group; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
    
    /** Gets an list of mixtures that define individual composite materials. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1), where the proportion values are specified in the same order as the base materials in MaterialIndices . */
    /* CompleteClass */
    var composites: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterial] = js.native
    
    /** Gets the identifier (ID) of the base material group that defines the materials used in the composite material group. */
    /* CompleteClass */
    var materialGroupId: Double = js.native
    
    /** Gets an ordered list of base materials that are used to make the composite materials in the group. The order of base materials is maintained in the mixture values defined by Composites . */
    /* CompleteClass */
    var materialIndices: IVector[Double] = js.native
  }
  
  /** Represents all material resources in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMaterial")
  @js.native
  /** Creates an instance of the Printing3DMaterial class. */
  class Printing3DMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMaterial {
    
    /** Gets all base material groups used in the 3D model. */
    /* CompleteClass */
    var baseGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup] = js.native
    
    /** Gets all color material groups used in the 3D model. */
    /* CompleteClass */
    var colorGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterialGroup] = js.native
    
    /** Gets all composite material groups used in the 3D model. */
    /* CompleteClass */
    var compositeGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup] = js.native
    
    /** Gets all multi-property groups used in the 3D model. */
    /* CompleteClass */
    var multiplePropertyGroups: IVector[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup
      ] = js.native
    
    /** Gets all 2D texture material groups used in the 3D model. */
    /* CompleteClass */
    var texture2CoordGroups: IVector[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup
      ] = js.native
  }
  
  /** Represents a mesh in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMesh")
  @js.native
  /** Creates an instance of the Printing3DMesh class. */
  class Printing3DMesh ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh {
    
    /** Gets a set of mesh buffer descriptions. */
    /* CompleteClass */
    var bufferDescriptionSet: IPropertySet = js.native
    
    /** Gets a set of mesh buffers. */
    /* CompleteClass */
    var bufferSet: IPropertySet = js.native
    
    /**
      * Creates the buffer for triangle indices.
      * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
      */
    /* CompleteClass */
    override def createTriangleIndices(value: Double): Unit = js.native
    
    /**
      * Creates the buffer for triangle material indices.
      * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
      */
    /* CompleteClass */
    override def createTriangleMaterialIndices(value: Double): Unit = js.native
    
    /**
      * Creates the buffer for vertex normals.
      * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
      */
    /* CompleteClass */
    override def createVertexNormals(value: Double): Unit = js.native
    
    /**
      * Creates the buffer for vertex positions.
      * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
      */
    /* CompleteClass */
    override def createVertexPositions(value: Double): Unit = js.native
    
    /**
      * Gets the buffer for triangle indices.
      * @return The buffer for triangle indices.
      */
    /* CompleteClass */
    override def getTriangleIndices(): IBuffer = js.native
    
    /**
      * Gets the buffer for triangle material indices.
      * @return The buffer for triangle material indices.
      */
    /* CompleteClass */
    override def getTriangleMaterialIndices(): IBuffer = js.native
    
    /**
      * Gets the buffer for vertex normals.
      * @return The buffer for vertex normals.
      */
    /* CompleteClass */
    override def getVertexNormals(): IBuffer = js.native
    
    /**
      * Gets the buffer for vertex positions.
      * @return The buffer for vertex positions.
      */
    /* CompleteClass */
    override def getVertexPositions(): IBuffer = js.native
    
    /** Gets or sets the number of triangle indices. */
    /* CompleteClass */
    var indexCount: Double = js.native
    
    /** Gets or sets the buffer description for triangle indices. */
    /* CompleteClass */
    var triangleIndicesDescription: Printing3DBufferDescription = js.native
    
    /** Gets or sets the buffer description for triangle material indices. */
    /* CompleteClass */
    var triangleMaterialIndicesDescription: Printing3DBufferDescription = js.native
    
    /**
      * Verifies the mesh has manifold edges and normal triangles.
      * @param value Specifies how the mesh is verified.
      * @return The results of the verification, of type Printing3DMeshVerificationResult .
      */
    /* CompleteClass */
    override def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationResult] = js.native
    
    /** Gets or sets the number of triangle vertices. */
    /* CompleteClass */
    var vertexCount: Double = js.native
    
    /** Gets or sets the buffer description for vertex normals. */
    /* CompleteClass */
    var vertexNormalsDescription: Printing3DBufferDescription = js.native
    
    /** Gets or sets the buffer description for vertex positions. */
    /* CompleteClass */
    var vertexPositionsDescription: Printing3DBufferDescription = js.native
  }
  
  /** Specifies how the mesh is verified. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationMode")
  @js.native
  object Printing3DMeshVerificationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode & Double
      ] = js.native
    
    /* 1 */ val findAllErrors: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findAllErrors & Double = js.native
    
    /* 0 */ val findFirstError: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findFirstError & Double = js.native
  }
  
  /** Provides data for the VerifyAsync method. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationResult")
  @js.native
  abstract class Printing3DMeshVerificationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationResult {
    
    /** Gets a value that indicates if the mesh is valid. */
    /* CompleteClass */
    var isValid: Boolean = js.native
    
    /** Gets the triangles with non-manifold edges, if applicable. */
    /* CompleteClass */
    var nonmanifoldTriangles: IVectorView[Double] = js.native
    
    /** Gets the reverse normal triangles, if applicable. */
    /* CompleteClass */
    var reversedNormalTriangles: IVectorView[Double] = js.native
  }
  
  /** Represents the 3D model in a 3D Manufacturing Format (3MF) package. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModel")
  @js.native
  /** Creates an instance of the Printing3DModel class. */
  class Printing3DModel ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModel {
    
    /** Gets or sets the root 3D Manufacturing Format (3MF) component. It represents the build plate on a 3D printer and defines what will be printed. */
    /* CompleteClass */
    var build: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent = js.native
    
    /** Gets all 3D Manufacturing Format (3MF) components used in the 3D model. */
    /* CompleteClass */
    var components: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent] = js.native
    
    /** Gets or sets the root material container for the 3D model. */
    /* CompleteClass */
    var material: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMaterial = js.native
    
    /** Gets all meshes used in the 3D model. */
    /* CompleteClass */
    var meshes: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh] = js.native
    
    /** Gets the metadata for the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var metadata: IMap[String, String] = js.native
    
    /**
      * Repairs the 3D model.
      * @return Results of the operation.
      */
    /* CompleteClass */
    override def repairAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets a list of the extensions required by the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var requiredExtensions: IVector[String] = js.native
    
    /** Gets all textures used in the 3D model. */
    /* CompleteClass */
    var textures: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture] = js.native
    
    /** Gets or sets the units of measure used in the 3D model. */
    /* CompleteClass */
    var unit: Printing3DModelUnit = js.native
    
    /** Gets or sets the version of the 3D Manufacturing Format (3MF) package. */
    /* CompleteClass */
    var version: String = js.native
  }
  
  /** Represents a texture used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModelTexture")
  @js.native
  /** Creates an instance of the Printing3DModelTexture class. */
  class Printing3DModelTexture ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture {
    
    /** Gets or sets the texture resource used by the texture. */
    /* CompleteClass */
    var textureResource: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource = js.native
    
    /** Get or sets a value that indicates how tiling should occur in the U axis in order to fill the overall requested area. */
    /* CompleteClass */
    var tileStyleU: Printing3DTextureEdgeBehavior = js.native
    
    /** Gets or sets a value that indicates how tiling should occur in the V axis in order to fill the overall requested area. */
    /* CompleteClass */
    var tileStyleV: Printing3DTextureEdgeBehavior = js.native
  }
  
  /** Specifies the units of measure used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DModelUnit")
  @js.native
  object Printing3DModelUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit & Double] = js.native
    
    /* 3 */ val centimeter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.centimeter & Double = js.native
    
    /* 5 */ val foot: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.foot & Double = js.native
    
    /* 4 */ val inch: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.inch & Double = js.native
    
    /* 0 */ val meter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.meter & Double = js.native
    
    /* 1 */ val micron: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.micron & Double = js.native
    
    /* 2 */ val millimeter: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.millimeter & Double = js.native
  }
  
  /** Represents a combination of properties and/or materials from the material groups specified in ( MaterialGroupIndices ). */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial")
  @js.native
  /** Creates an instance of the Printing3DMultiplePropertyMaterial class. */
  class Printing3DMultiplePropertyMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial {
    
    /** Gets the indices of the properties and/or materials combined in the multi-property material. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
    /* CompleteClass */
    var materialIndices: IVector[Double] = js.native
  }
  
  /** Represents a multi-property material group. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup")
  @js.native
  class Printing3DMultiplePropertyMaterialGroup protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup {
    /**
      * Creates a new instance of the Printing3DMultiplePropertyMaterialGroup class.
      * @param MaterialGroupId The identifier (ID) of the multi-property material group; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
    
    /** Gets the identifier (ID) of the multi-property material group. */
    /* CompleteClass */
    var materialGroupId: Double = js.native
    
    /** Gets an ordered list of material groups ( MaterialGroupId values) that are used to define property-material combinations in the multi-property group. The order of material groups is maintained in the combinations defined by MultipleProperties . */
    /* CompleteClass */
    var materialGroupIndices: IVector[Double] = js.native
    
    /** Gets a list of property-material combinations. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
    /* CompleteClass */
    var multipleProperties: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial] = js.native
  }
  
  /** Specifies the function of the object in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DObjectType")
  @js.native
  object Printing3DObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType & Double] = js.native
    
    /* 0 */ val model: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.model & Double = js.native
    
    /* 2 */ val others: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.others & Double = js.native
    
    /* 1 */ val support: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType.support & Double = js.native
  }
  
  /** Represents a 2D texture material used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial")
  @js.native
  /** Creates an instance of the Printing3DTexture2CoordMaterial class. */
  class Printing3DTexture2CoordMaterial ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial {
    
    /** Gets or sets the texture used in the 2D texture material. */
    /* CompleteClass */
    var texture: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture = js.native
    
    /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
    /* CompleteClass */
    var u: Double = js.native
    
    /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
    /* CompleteClass */
    var v: Double = js.native
  }
  
  /** Represents a group of 2D texture materials used in the 3D model. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup")
  @js.native
  class Printing3DTexture2CoordMaterialGroup protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup {
    /**
      * Creates a instance of the Printing3DTexture2CoordMaterialGroup class.
      * @param MaterialGroupId The identifier for a group of 2D texture materials used in the 3D model; a value greater than zero.
      */
    def this(MaterialGroupId: Double) = this()
    
    /** Gets the identifier (ID) of the 2D texture material group. */
    /* CompleteClass */
    var materialGroupId: Double = js.native
    
    /** Gets or sets the texture of the material group. */
    /* CompleteClass */
    var texture: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture = js.native
    
    /** Gets a group of 2D texture materials used in the 3D model. */
    /* CompleteClass */
    var texture2Coords: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial] = js.native
  }
  
  /** Specifies how tiling should occur in the U and V axis in order to fill the overall requested area of a texture. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior")
  @js.native
  object Printing3DTextureEdgeBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior & Double
      ] = js.native
    
    /* 3 */ val clamp: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.clamp & Double = js.native
    
    /* 2 */ val mirror: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.mirror & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.none & Double = js.native
    
    /* 1 */ val wrap: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior.wrap & Double = js.native
  }
  
  /** Specifies the texture resource used in a 2D texture material. */
  @JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureResource")
  @js.native
  /** Creates an instance of the Printing3DTextureResource class. */
  class Printing3DTextureResource ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource {
    
    /** Gets or sets the name of the texture resource. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets or sets the image stream of the texture resource. */
    /* CompleteClass */
    var textureData: IRandomAccessStreamWithContentType = js.native
  }
}
