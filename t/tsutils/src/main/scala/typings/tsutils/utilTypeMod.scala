package typings.tsutils

import typings.tsutils.utilUtilMod.PropertyName
import typings.typescript.mod.ClassLikeDeclaration
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import typings.typescript.mod.Signature
import typings.typescript.mod.String
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTypeMod {
  
  @JSImport("tsutils/util/type", "getCallSignaturesOfType")
  @js.native
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  
  @JSImport("tsutils/util/type", "getConstructorTypeOfClassLikeDeclaration")
  @js.native
  def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util/type", "getInstanceTypeOfClassLikeDeclaration")
  @js.native
  def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util/type", "getIteratorYieldResultFromIteratorResult")
  @js.native
  def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils/util/type", "getPropertyNameFromType")
  @js.native
  def getPropertyNameFromType(`type`: Type): js.UndefOr[PropertyName] = js.native
  
  @JSImport("tsutils/util/type", "getPropertyOfType")
  @js.native
  def getPropertyOfType(`type`: Type, name: String): js.UndefOr[Symbol] = js.native
  
  @JSImport("tsutils/util/type", "intersectionTypeParts")
  @js.native
  def intersectionTypeParts(`type`: Type): js.Array[Type] = js.native
  
  @JSImport("tsutils/util/type", "isBooleanLiteralType")
  @js.native
  def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = js.native
  
  @JSImport("tsutils/util/type", "isEmptyObjectType")
  @js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  
  @JSImport("tsutils/util/type", "isFalsyType")
  @js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util/type", "isPropertyReadonlyInType")
  @js.native
  def isPropertyReadonlyInType(`type`: Type, name: String, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils/util/type", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  @JSImport("tsutils/util/type", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  @JSImport("tsutils/util/type", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util/type", "isTypeAssignableToNumber")
  @js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util/type", "isTypeAssignableToString")
  @js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils/util/type", "removeOptionalityFromType")
  @js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  
  @JSImport("tsutils/util/type", "someTypePart")
  @js.native
  def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = js.native
  
  @JSImport("tsutils/util/type", "symbolHasReadonlyDeclaration")
  @js.native
  def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils/util/type", "unionTypeParts")
  @js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
}
