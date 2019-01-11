package typings
package wonderDotJsLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CompileConfig: wonderDotJsLib.Anon_CloseContractTest = js.native
  val DEG_TO_RAD: scala.Double = js.native
  var DebugConfig: wonderDotJsLib.Anon_DebugCollision = js.native
  val RAD_TO_DEG: scala.Double = js.native
  var root: js.Any = js.native
  def assert(cond: scala.Boolean): scala.Unit = js.native
  def assert(cond: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def cache(judgeFunc: js.Any, returnCacheValueFunc: js.Any, setCacheFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainer(): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: java.lang.String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheGetter(
    judgeFunc: js.Function0[scala.Boolean],
    returnCacheValueFunc: js.Function0[_],
    setCacheFunc: js.Function1[/* returnVal */ js.Any, scala.Unit]
  ): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsBasicType(
    configData: wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsBasicTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCloneable(
    configData: wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsCloneableConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ java.lang.String, 
      /* cloneData */ js.Any, 
      scala.Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ java.lang.String, 
      /* cloneData */ js.Any, 
      scala.Unit
    ],
    configData: wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def describe(message: java.lang.String, func: js.Function): scala.Unit = js.native
  def describe(message: java.lang.String, func: js.Function, preCondition: js.Function): scala.Unit = js.native
  def describe(message: java.lang.String, func: js.Function, preCondition: js.Function, context: js.Any): scala.Unit = js.native
  def ensure(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetterAndSetter(outGetterFunc: js.Any, outSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureSetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def execOnlyOnce(flagName: java.lang.String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def invariant(func: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def it(message: java.lang.String, func: js.Function): scala.Unit = js.native
  def it(message: java.lang.String, func: js.Function, context: js.Any): scala.Unit = js.native
  def registerClass(className: java.lang.String): js.Function1[/* _class */ js.Any, scala.Unit] = js.native
  def requireCheck(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetterAndSetter(inGetterFunc: js.Any, inSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireSetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def singleton(): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def singleton(isInitWhenCreate: scala.Boolean): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def virtual(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
}

