package typings.typescript.mod

import typings.typescript.anon.ExpressionWithTypeArgumen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note that `@extends` is a synonym of `@augments`.
  * Both tags are represented by this interface.
  */
@js.native
trait JSDocAugmentsTag
  extends StObject
     with JSDocTag {
  
  val `class`: ExpressionWithTypeArgumen = js.native
  
  @JSName("kind")
  val kind_JSDocAugmentsTag: typings.typescript.mod.SyntaxKind.JSDocAugmentsTag = js.native
}
