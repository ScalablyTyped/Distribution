package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.anon.TypeoftfOps
import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationsTypesMod {
  
  trait AttrParamMapper
    extends StObject
       with ParamMapper {
    
    var tfDeprecatedName: js.UndefOr[String] = js.undefined
    
    var tfName: js.UndefOr[String] = js.undefined
  }
  object AttrParamMapper {
    
    inline def apply(name: String, `type`: ParamType): AttrParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrParamMapper]
    }
    
    extension [Self <: AttrParamMapper](x: Self) {
      
      inline def setTfDeprecatedName(value: String): Self = StObject.set(x, "tfDeprecatedName", value.asInstanceOf[js.Any])
      
      inline def setTfDeprecatedNameUndefined: Self = StObject.set(x, "tfDeprecatedName", js.undefined)
      
      inline def setTfName(value: String): Self = StObject.set(x, "tfName", value.asInstanceOf[js.Any])
      
      inline def setTfNameUndefined: Self = StObject.set(x, "tfName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.sparse
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation
  */
  trait Category extends StObject
  object Category {
    
    inline def arithmetic: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic = "arithmetic".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic]
    
    inline def basic_math: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math = "basic_math".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math]
    
    inline def control: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control = "control".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control]
    
    inline def convolution: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution = "convolution".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution]
    
    inline def creation: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation = "creation".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation]
    
    inline def custom: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom = "custom".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom]
    
    inline def dynamic: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic = "dynamic".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic]
    
    inline def evaluation: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation = "evaluation".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation]
    
    inline def graph: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph = "graph".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph]
    
    inline def hash_table: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table = "hash_table".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table]
    
    inline def image: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image = "image".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image]
    
    inline def logical: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical = "logical".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical]
    
    inline def matrices: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices = "matrices".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices]
    
    inline def normalization: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization = "normalization".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization]
    
    inline def reduction: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction = "reduction".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction]
    
    inline def slice_join: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join = "slice_join".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join]
    
    inline def sparse: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.sparse = "sparse".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.sparse]
    
    inline def spectral: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral = "spectral".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral]
    
    inline def string: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string = "string".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string]
    
    inline def transformation: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation = "transformation".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation]
  }
  
  trait Graph extends StObject {
    
    var functions: js.UndefOr[StringDictionary[Graph]] = js.undefined
    
    var initNodes: js.UndefOr[js.Array[Node]] = js.undefined
    
    var inputs: js.Array[Node]
    
    var nodes: StringDictionary[Node]
    
    var outputs: js.Array[Node]
    
    var placeholders: js.Array[Node]
    
    var signature: js.UndefOr[ISignatureDef] = js.undefined
    
    var weights: js.Array[Node]
  }
  object Graph {
    
    inline def apply(
      inputs: js.Array[Node],
      nodes: StringDictionary[Node],
      outputs: js.Array[Node],
      placeholders: js.Array[Node],
      weights: js.Array[Node]
    ): Graph = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    extension [Self <: Graph](x: Self) {
      
      inline def setFunctions(value: StringDictionary[Graph]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setInitNodes(value: js.Array[Node]): Self = StObject.set(x, "initNodes", value.asInstanceOf[js.Any])
      
      inline def setInitNodesUndefined: Self = StObject.set(x, "initNodes", js.undefined)
      
      inline def setInitNodesVarargs(value: Node*): Self = StObject.set(x, "initNodes", js.Array(value*))
      
      inline def setInputs(value: js.Array[Node]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: Node*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setNodes(value: StringDictionary[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: js.Array[Node]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Node*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setPlaceholders(value: js.Array[Node]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersVarargs(value: Node*): Self = StObject.set(x, "placeholders", js.Array(value*))
      
      inline def setSignature(value: ISignatureDef): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setWeights(value: js.Array[Node]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: Node*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  trait GraphNode extends StObject {
    
    var attrs: StringDictionary[ValueType]
    
    var inputs: js.Array[Tensor[Rank]]
  }
  object GraphNode {
    
    inline def apply(attrs: StringDictionary[ValueType], inputs: js.Array[Tensor[Rank]]): GraphNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphNode]
    }
    
    extension [Self <: GraphNode](x: Self) {
      
      inline def setAttrs(value: StringDictionary[ValueType]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "inputs", js.Array(value*))
    }
  }
  
  trait InputParamMapper
    extends StObject
       with ParamMapper {
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: Double
  }
  object InputParamMapper {
    
    inline def apply(name: String, start: Double, `type`: ParamType): InputParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputParamMapper]
    }
    
    extension [Self <: InputParamMapper](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputParamValue
    extends StObject
       with ParamValue {
    
    var inputIndexEnd: js.UndefOr[Double] = js.undefined
    
    var inputIndexStart: js.UndefOr[Double] = js.undefined
  }
  object InputParamValue {
    
    inline def apply(`type`: ParamType): InputParamValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputParamValue]
    }
    
    extension [Self <: InputParamValue](x: Self) {
      
      inline def setInputIndexEnd(value: Double): Self = StObject.set(x, "inputIndexEnd", value.asInstanceOf[js.Any])
      
      inline def setInputIndexEndUndefined: Self = StObject.set(x, "inputIndexEnd", js.undefined)
      
      inline def setInputIndexStart(value: Double): Self = StObject.set(x, "inputIndexStart", value.asInstanceOf[js.Any])
      
      inline def setInputIndexStartUndefined: Self = StObject.set(x, "inputIndexStart", js.undefined)
    }
  }
  
  type InternalOpAsyncExecutor = js.Function5[
    /* node */ Node, 
    /* tensorMap */ NamedTensorsMap, 
    /* context */ ExecutionContext, 
    /* resourceManager */ js.UndefOr[ResourceManager], 
    /* ops */ js.UndefOr[TypeoftfOps], 
    js.Promise[js.Array[Tensor[Rank]]]
  ]
  
  type InternalOpExecutor = js.Function4[
    /* node */ Node, 
    /* tensorMap */ NamedTensorsMap, 
    /* context */ ExecutionContext, 
    /* ops */ js.UndefOr[TypeoftfOps], 
    Tensor[Rank] | js.Array[Tensor[Rank]]
  ]
  
  trait Node extends StObject {
    
    var attrParams: StringDictionary[ParamValue]
    
    var category: Category
    
    var children: js.Array[Node]
    
    var defaultOutput: js.UndefOr[Double] = js.undefined
    
    var inputNames: js.Array[String]
    
    var inputParams: StringDictionary[InputParamValue]
    
    var inputs: js.Array[Node]
    
    var name: String
    
    var op: String
    
    var outputs: js.UndefOr[js.Array[String]] = js.undefined
    
    var rawAttrs: js.UndefOr[StringDictionary[IAttrValue]] = js.undefined
    
    var signatureKey: js.UndefOr[String] = js.undefined
  }
  object Node {
    
    inline def apply(
      attrParams: StringDictionary[ParamValue],
      category: Category,
      children: js.Array[Node],
      inputNames: js.Array[String],
      inputParams: StringDictionary[InputParamValue],
      inputs: js.Array[Node],
      name: String,
      op: String
    ): Node = {
      val __obj = js.Dynamic.literal(attrParams = attrParams.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], inputNames = inputNames.asInstanceOf[js.Any], inputParams = inputParams.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAttrParams(value: StringDictionary[ParamValue]): Self = StObject.set(x, "attrParams", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefaultOutput(value: Double): Self = StObject.set(x, "defaultOutput", value.asInstanceOf[js.Any])
      
      inline def setDefaultOutputUndefined: Self = StObject.set(x, "defaultOutput", js.undefined)
      
      inline def setInputNames(value: js.Array[String]): Self = StObject.set(x, "inputNames", value.asInstanceOf[js.Any])
      
      inline def setInputNamesVarargs(value: String*): Self = StObject.set(x, "inputNames", js.Array(value*))
      
      inline def setInputParams(value: StringDictionary[InputParamValue]): Self = StObject.set(x, "inputParams", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[Node]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: Node*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setRawAttrs(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "rawAttrs", value.asInstanceOf[js.Any])
      
      inline def setRawAttrsUndefined: Self = StObject.set(x, "rawAttrs", js.undefined)
      
      inline def setSignatureKey(value: String): Self = StObject.set(x, "signatureKey", value.asInstanceOf[js.Any])
      
      inline def setSignatureKeyUndefined: Self = StObject.set(x, "signatureKey", js.undefined)
    }
  }
  
  type OpExecutor = js.Function1[
    /* node */ GraphNode, 
    Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
  ]
  
  trait OpMapper extends StObject {
    
    var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.undefined
    
    var category: js.UndefOr[Category] = js.undefined
    
    var customExecutor: js.UndefOr[OpExecutor] = js.undefined
    
    var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.undefined
    
    var outputs: js.UndefOr[js.Array[String]] = js.undefined
    
    var tfOpName: String
  }
  object OpMapper {
    
    inline def apply(tfOpName: String): OpMapper = {
      val __obj = js.Dynamic.literal(tfOpName = tfOpName.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpMapper]
    }
    
    extension [Self <: OpMapper](x: Self) {
      
      inline def setAttrs(value: js.Array[AttrParamMapper]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: AttrParamMapper*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCustomExecutor(
        value: /* node */ GraphNode => Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
      ): Self = StObject.set(x, "customExecutor", js.Any.fromFunction1(value))
      
      inline def setCustomExecutorUndefined: Self = StObject.set(x, "customExecutor", js.undefined)
      
      inline def setInputs(value: js.Array[InputParamMapper]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: InputParamMapper*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setTfOpName(value: String): Self = StObject.set(x, "tfOpName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParamMapper extends StObject {
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var name: String
    
    var notSupported: js.UndefOr[Boolean] = js.undefined
    
    var `type`: ParamType
  }
  object ParamMapper {
    
    inline def apply(name: String, `type`: ParamType): ParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamMapper]
    }
    
    extension [Self <: ParamMapper](x: Self) {
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotSupported(value: Boolean): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
      
      inline def setNotSupportedUndefined: Self = StObject.set(x, "notSupported", js.undefined)
      
      inline def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]`
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]`
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]`
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]`
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]`
    - typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func
  */
  trait ParamType extends StObject
  object ParamType {
    
    inline def bool: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool = "bool".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool]
    
    inline def `bool[]`: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]` = "bool[]".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]`]
    
    inline def dtype: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype = "dtype".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype]
    
    inline def `dtype[]`: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]` = "dtype[]".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]`]
    
    inline def func: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func = "func".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func]
    
    inline def number: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number = "number".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number]
    
    inline def `number[]`: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]` = "number[]".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]`]
    
    inline def shape: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape = "shape".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape]
    
    inline def `shape[]`: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]` = "shape[]".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]`]
    
    inline def string: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string = "string".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string]
    
    inline def `string[]`: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]` = "string[]".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]`]
    
    inline def tensor: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor = "tensor".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor]
    
    inline def tensors: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors = "tensors".asInstanceOf[typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors]
  }
  
  trait ParamValue extends StObject {
    
    var `type`: ParamType
    
    var value: js.UndefOr[ValueType] = js.undefined
  }
  object ParamValue {
    
    inline def apply(`type`: ParamType): ParamValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamValue]
    }
    
    extension [Self <: ParamValue](x: Self) {
      
      inline def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type ValueType = String | (js.Array[js.Array[Double] | Boolean | Double | String | Tensor[Rank]]) | Double | Boolean | Tensor[Rank]
}
