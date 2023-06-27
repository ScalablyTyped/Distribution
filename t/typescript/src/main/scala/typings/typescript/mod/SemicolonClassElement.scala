package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** For when we encounter a semicolon in a class declaration. ES6 allows these as class elements. */
@js.native
trait SemicolonClassElement
  extends StObject
     with ClassElement
     with JSDocContainer
     with HasJSDoc {
  
  @JSName("kind")
  val kind_SemicolonClassElement: typings.typescript.mod.SyntaxKind.SemicolonClassElement = js.native
  
  @JSName("parent")
  val parent_SemicolonClassElement: ClassLikeDeclaration = js.native
}
