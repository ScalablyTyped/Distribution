package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def DEG_TO_RAD: scala.Double = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[scala.Double]

@scala.inline
def RAD_TO_DEG: scala.Double = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[scala.Double]

@scala.inline
def assert(cond: scala.Boolean): scala.Unit = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def assert(cond: scala.Boolean, message: java.lang.String): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def cache(judgeFunc: js.Any, returnCacheValueFunc: js.Any, setCacheFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cache")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def cacheBufferForBufferContainer(): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainer")().asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: java.lang.String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainerWithFuncParam")(setDataNameFuncName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def cacheGetter(
  judgeFunc: js.Function0[scala.Boolean],
  returnCacheValueFunc: js.Function0[js.Any],
  setCacheFunc: js.Function1[/* returnVal */ js.Any, scala.Unit]
): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cacheGetter")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")().asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]
@scala.inline
def cloneAttributeAsBasicType(configData: typings.wonderJs.cloneMod.CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsBasicType")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]

@scala.inline
def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")().asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]
@scala.inline
def cloneAttributeAsCloneable(configData: typings.wonderJs.cloneMod.CloneAttributeAsCloneableConfigData): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCloneable")(configData.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]

@scala.inline
def cloneAttributeAsCustomType(
  cloneFunc: js.Function4[
  /* source */ js.Any, 
  /* target */ js.Any, 
  /* memberName */ java.lang.String, 
  /* cloneData */ js.Any, 
  scala.Unit
]
): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]
@scala.inline
def cloneAttributeAsCustomType(
  cloneFunc: js.Function4[
  /* source */ js.Any, 
  /* target */ js.Any, 
  /* memberName */ java.lang.String, 
  /* cloneData */ js.Any, 
  scala.Unit
],
  configData: typings.wonderJs.cloneMod.CloneAttributeAsCustomTypeConfigData
): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneAttributeAsCustomType")(cloneFunc.asInstanceOf[js.Any], configData.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit]]

@scala.inline
def describe(message: java.lang.String, func: js.Function): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def describe(message: java.lang.String, func: js.Function, preCondition: js.Function): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def describe(message: java.lang.String, func: js.Function, preCondition: js.Function, context: js.Any): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def describe(message: java.lang.String, func: js.Function, preCondition: scala.Unit, context: js.Any): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensure(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def ensureGetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def ensureGetterAndSetter(outGetterFunc: js.Any, outSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetterAndSetter")(outGetterFunc.asInstanceOf[js.Any], outSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def ensureSetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def execOnlyOnce(flagName: java.lang.String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("execOnlyOnce")(flagName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def invariant(func: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, scala.Unit]]

@scala.inline
def it(message: java.lang.String, func: js.Function): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def it(message: java.lang.String, func: js.Function, context: js.Any): scala.Unit = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def registerClass(className: java.lang.String): js.Function1[/* _class */ js.Any, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _class */ js.Any, scala.Unit]]

@scala.inline
def requireCheck(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("requireCheck")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def requireGetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("requireGetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def requireGetterAndSetter(inGetterFunc: js.Any, inSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("requireGetterAndSetter")(inGetterFunc.asInstanceOf[js.Any], inSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def requireSetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("requireSetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]

@scala.inline
def root: js.Any = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("root").asInstanceOf[js.Any]
@scala.inline
def root_=(x: js.Any): scala.Unit = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])

@scala.inline
def singleton(): js.Function1[/* target */ js.Any, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[js.Function1[/* target */ js.Any, scala.Unit]]
@scala.inline
def singleton(isInitWhenCreate: scala.Boolean): js.Function1[/* target */ js.Any, scala.Unit] = typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(isInitWhenCreate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, scala.Unit]]

@scala.inline
def virtual(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = (typings.wonderJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("virtual")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
