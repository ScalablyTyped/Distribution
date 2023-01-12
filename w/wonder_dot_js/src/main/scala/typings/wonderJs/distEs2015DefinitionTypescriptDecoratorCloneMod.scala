package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015DefinitionTypescriptDecoratorCloneMod {
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CloneType extends StObject
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneType")
  @js.native
  object CloneType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CloneType & Double] = js.native
    
    @js.native
    sealed trait BASIC
      extends StObject
         with CloneType
    /* 1 */ val BASIC: typings.wonderJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.BASIC & Double = js.native
    
    @js.native
    sealed trait CLONEABLE
      extends StObject
         with CloneType
    /* 0 */ val CLONEABLE: typings.wonderJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.CLONEABLE & Double = js.native
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with CloneType
    /* 2 */ val CUSTOM: typings.wonderJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.CUSTOM & Double = js.native
  }
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
  @js.native
  open class CloneUtils () extends StObject
  /* static members */
  object CloneUtils {
    
    @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone[T](sourceInstance: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: js.Array[Any], target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: Unit, target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[Any], target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: Unit, target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def cloneArray(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")().asInstanceOf[Any]
    inline def cloneArray(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def cloneArray(arr: js.Array[Any], isDeep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def cloneArray(arr: Null, isDeep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isNotClone(entityObject: EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def markNotClone(entityObject: EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def cloneAttributeAsBasicType(): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")().asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsBasicType(configData: CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  
  inline def cloneAttributeAsCloneable(): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")().asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsCloneable(configData: CloneAttributeAsCloneableConfigData): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  
  inline def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[/* source */ Any, /* target */ Any, /* memberName */ String, /* cloneData */ Any, Unit]
  ): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[/* source */ Any, /* target */ Any, /* memberName */ String, /* cloneData */ Any, Unit],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any], configData.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* memberName */ String | js.Symbol, Unit]]
  
  trait CloneAttributeAsBasicTypeConfigData extends StObject {
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object CloneAttributeAsBasicTypeConfigData {
    
    inline def apply(): CloneAttributeAsBasicTypeConfigData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneAttributeAsBasicTypeConfigData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloneAttributeAsBasicTypeConfigData] (val x: Self) extends AnyVal {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait CloneAttributeAsCloneableConfigData extends StObject {
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object CloneAttributeAsCloneableConfigData {
    
    inline def apply(): CloneAttributeAsCloneableConfigData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneAttributeAsCloneableConfigData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloneAttributeAsCloneableConfigData] (val x: Self) extends AnyVal {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait CloneAttributeAsCustomTypeConfigData extends StObject {
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object CloneAttributeAsCustomTypeConfigData {
    
    inline def apply(): CloneAttributeAsCustomTypeConfigData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneAttributeAsCustomTypeConfigData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloneAttributeAsCustomTypeConfigData] (val x: Self) extends AnyVal {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
