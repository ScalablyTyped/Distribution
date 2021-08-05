package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
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
    /* 1 */ val BASIC: typings.wonderJs.cloneMod.CloneType.BASIC & Double = js.native
    
    @js.native
    sealed trait CLONEABLE
      extends StObject
         with CloneType
    /* 0 */ val CLONEABLE: typings.wonderJs.cloneMod.CloneType.CLONEABLE & Double = js.native
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with CloneType
    /* 2 */ val CUSTOM: typings.wonderJs.cloneMod.CloneType.CUSTOM & Double = js.native
  }
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
  @js.native
  class CloneUtils () extends StObject
  /* static members */
  object CloneUtils {
    
    @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone[T](sourceInstance: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[js.Any], target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: Unit, target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[js.Any], target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: Unit, target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def cloneArray(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")().asInstanceOf[js.Any]
    inline def cloneArray(arr: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def cloneArray(arr: js.Array[js.Any], isDeep: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def cloneArray(arr: Null, isDeep: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def isNotClone(entityObject: EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def markNotClone(entityObject: EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")().asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsBasicType(configData: CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  
  inline def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")().asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsCloneable(configData: CloneAttributeAsCloneableConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  
  inline def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  inline def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any], configData.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit]]
  
  trait CloneAttributeAsBasicTypeConfigData extends StObject {
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object CloneAttributeAsBasicTypeConfigData {
    
    inline def apply(): CloneAttributeAsBasicTypeConfigData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneAttributeAsBasicTypeConfigData]
    }
    
    extension [Self <: CloneAttributeAsBasicTypeConfigData](x: Self) {
      
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
    
    extension [Self <: CloneAttributeAsCloneableConfigData](x: Self) {
      
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
    
    extension [Self <: CloneAttributeAsCustomTypeConfigData](x: Self) {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
