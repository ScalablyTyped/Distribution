package typings.webpackDashConfigDashUtils

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.DefinedObjKeys
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.EnvVars
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.Falsy
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.IfUtils
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.IfUtilsFn
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod.NonEmptyObject
import typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod._Falsy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-config-utils", JSImport.Namespace)
@js.native
object webpackDashConfigDashUtilsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.production
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.prod
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.test
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.development
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.dev
  */
  trait EnvVars extends js.Object
  
  @js.native
  trait IfUtils extends /* key */ StringDictionary[IfUtilsFn] {
    @JSName("ifDev")
    var ifDev_Original: IfUtilsFn = js.native
    @JSName("ifDevelopment")
    var ifDevelopment_Original: IfUtilsFn = js.native
    @JSName("ifNotDev")
    var ifNotDev_Original: IfUtilsFn = js.native
    @JSName("ifNotDevelopment")
    var ifNotDevelopment_Original: IfUtilsFn = js.native
    @JSName("ifNotProd")
    var ifNotProd_Original: IfUtilsFn = js.native
    @JSName("ifNotProduction")
    var ifNotProduction_Original: IfUtilsFn = js.native
    @JSName("ifNotTest")
    var ifNotTest_Original: IfUtilsFn = js.native
    @JSName("ifProd")
    var ifProd_Original: IfUtilsFn = js.native
    @JSName("ifProduction")
    var ifProduction_Original: IfUtilsFn = js.native
    @JSName("ifTest")
    var ifTest_Original: IfUtilsFn = js.native
    def ifDev(): Boolean = js.native
    def ifDev[Y, N](value: Y): Y | N = js.native
    def ifDev[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifDevelopment(): Boolean = js.native
    def ifDevelopment[Y, N](value: Y): Y | N = js.native
    def ifDevelopment[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifNotDev(): Boolean = js.native
    def ifNotDev[Y, N](value: Y): Y | N = js.native
    def ifNotDev[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifNotDevelopment(): Boolean = js.native
    def ifNotDevelopment[Y, N](value: Y): Y | N = js.native
    def ifNotDevelopment[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifNotProd(): Boolean = js.native
    def ifNotProd[Y, N](value: Y): Y | N = js.native
    def ifNotProd[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifNotProduction(): Boolean = js.native
    def ifNotProduction[Y, N](value: Y): Y | N = js.native
    def ifNotProduction[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifNotTest(): Boolean = js.native
    def ifNotTest[Y, N](value: Y): Y | N = js.native
    def ifNotTest[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifProd(): Boolean = js.native
    def ifProd[Y, N](value: Y): Y | N = js.native
    def ifProd[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifProduction(): Boolean = js.native
    def ifProduction[Y, N](value: Y): Y | N = js.native
    def ifProduction[Y, N](value: Y, alternate: N): Y | N = js.native
    def ifTest(): Boolean = js.native
    def ifTest[Y, N](value: Y): Y | N = js.native
    def ifTest[Y, N](value: Y, alternate: N): Y | N = js.native
  }
  
  @js.native
  trait IfUtilsFn extends js.Object {
    def apply(): Boolean = js.native
    def apply[Y, N](value: Y): Y | N = js.native
    def apply[Y, N](value: Y, alternate: N): Y | N = js.native
  }
  
  trait _Falsy extends js.Object
  
  def getIfUtils[E /* <: EnvVars | String */](env: E): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](env: E, vars: js.Array[EnvVars | String]): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.getIfUtils with js.Any
  ): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.getIfUtils with js.Any,
    vars: js.Array[EnvVars | String]
  ): IfUtils = js.native
  def propIf[I](a: js.Any, value: I, alternate: js.Any): I = js.native
  def propIf[E](a: Falsy, value: js.Any, alternate: E): E = js.native
  def propIfNot[E](a: js.Any, value: js.Any, alternate: E): E = js.native
  def propIfNot[I](a: Falsy, value: I, alternate: js.Any): I = js.native
  def removeEmpty[T](
    input: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.removeEmpty with T
  ): NonEmptyObject[T, DefinedObjKeys[T]] = js.native
  def removeEmpty[T](input: js.Array[js.UndefOr[T]]): js.Array[T] = js.native
  type DefinedObjKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsNumbers.`false`
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.Empty
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.`false`
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.NonEmptyObject with T
}

