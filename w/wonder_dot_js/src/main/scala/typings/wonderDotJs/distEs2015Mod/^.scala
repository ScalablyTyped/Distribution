package typings.wonderDotJs.distEs2015Mod

import typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsBasicTypeConfigData
import typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsCloneableConfigData
import typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneAttributeAsCustomTypeConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEG_TO_RAD: Double = js.native
  val RAD_TO_DEG: Double = js.native
  var root: js.Any = js.native
  def assert(cond: Boolean): Unit = js.native
  def assert(cond: Boolean, message: String): Unit = js.native
  def cache(judgeFunc: js.Any, returnCacheValueFunc: js.Any, setCacheFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainer(): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheGetter(
    judgeFunc: js.Function0[Boolean],
    returnCacheValueFunc: js.Function0[_],
    setCacheFunc: js.Function1[/* returnVal */ js.Any, Unit]
  ): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsBasicType(configData: CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCloneable(configData: CloneAttributeAsCloneableConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def describe(message: String, func: js.Function): Unit = js.native
  def describe(message: String, func: js.Function, preCondition: js.Function): Unit = js.native
  def describe(message: String, func: js.Function, preCondition: js.Function, context: js.Any): Unit = js.native
  def ensure(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetterAndSetter(outGetterFunc: js.Any, outSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureSetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def execOnlyOnce(flagName: String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def invariant(func: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  def it(message: String, func: js.Function): Unit = js.native
  def it(message: String, func: js.Function, context: js.Any): Unit = js.native
  def registerClass(className: String): js.Function1[/* _class */ js.Any, Unit] = js.native
  def requireCheck(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetterAndSetter(inGetterFunc: js.Any, inSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireSetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def singleton(): js.Function1[/* target */ js.Any, Unit] = js.native
  def singleton(isInitWhenCreate: Boolean): js.Function1[/* target */ js.Any, Unit] = js.native
  def virtual(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
}

