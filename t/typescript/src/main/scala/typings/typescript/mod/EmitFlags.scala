package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFlags extends StObject
@JSImport("typescript", "EmitFlags")
@js.native
object EmitFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFlags & Double] = js.native
  
  @js.native
  sealed trait AdviseOnEmitNode
    extends StObject
       with EmitFlags
  /* 4 */ val AdviseOnEmitNode: typings.typescript.mod.EmitFlags.AdviseOnEmitNode & Double = js.native
  
  @js.native
  sealed trait AsyncFunctionBody
    extends StObject
       with EmitFlags
  /* 524288 */ val AsyncFunctionBody: typings.typescript.mod.EmitFlags.AsyncFunctionBody & Double = js.native
  
  @js.native
  sealed trait CapturesThis
    extends StObject
       with EmitFlags
  /* 16 */ val CapturesThis: typings.typescript.mod.EmitFlags.CapturesThis & Double = js.native
  
  @js.native
  sealed trait CustomPrologue
    extends StObject
       with EmitFlags
  /* 2097152 */ val CustomPrologue: typings.typescript.mod.EmitFlags.CustomPrologue & Double = js.native
  
  @js.native
  sealed trait ExportName
    extends StObject
       with EmitFlags
  /* 16384 */ val ExportName: typings.typescript.mod.EmitFlags.ExportName & Double = js.native
  
  @js.native
  sealed trait HasEndOfDeclarationMarker
    extends StObject
       with EmitFlags
  /* 8388608 */ val HasEndOfDeclarationMarker: typings.typescript.mod.EmitFlags.HasEndOfDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait HelperName
    extends StObject
       with EmitFlags
  /* 8192 */ val HelperName: typings.typescript.mod.EmitFlags.HelperName & Double = js.native
  
  @js.native
  sealed trait Indented
    extends StObject
       with EmitFlags
  /* 131072 */ val Indented: typings.typescript.mod.EmitFlags.Indented & Double = js.native
  
  @js.native
  sealed trait InternalName
    extends StObject
       with EmitFlags
  /* 65536 */ val InternalName: typings.typescript.mod.EmitFlags.InternalName & Double = js.native
  
  @js.native
  sealed trait Iterator
    extends StObject
       with EmitFlags
  /* 16777216 */ val Iterator: typings.typescript.mod.EmitFlags.Iterator & Double = js.native
  
  @js.native
  sealed trait LocalName
    extends StObject
       with EmitFlags
  /* 32768 */ val LocalName: typings.typescript.mod.EmitFlags.LocalName & Double = js.native
  
  @js.native
  sealed trait MultiLine
    extends StObject
       with EmitFlags
  /* 2 */ val MultiLine: typings.typescript.mod.EmitFlags.MultiLine & Double = js.native
  
  @js.native
  sealed trait NoAsciiEscaping
    extends StObject
       with EmitFlags
  /* 33554432 */ val NoAsciiEscaping: typings.typescript.mod.EmitFlags.NoAsciiEscaping & Double = js.native
  
  @js.native
  sealed trait NoComments
    extends StObject
       with EmitFlags
  /* 3072 */ val NoComments: typings.typescript.mod.EmitFlags.NoComments & Double = js.native
  
  @js.native
  sealed trait NoHoisting
    extends StObject
       with EmitFlags
  /* 4194304 */ val NoHoisting: typings.typescript.mod.EmitFlags.NoHoisting & Double = js.native
  
  @js.native
  sealed trait NoIndentation
    extends StObject
       with EmitFlags
  /* 262144 */ val NoIndentation: typings.typescript.mod.EmitFlags.NoIndentation & Double = js.native
  
  @js.native
  sealed trait NoLeadingComments
    extends StObject
       with EmitFlags
  /* 1024 */ val NoLeadingComments: typings.typescript.mod.EmitFlags.NoLeadingComments & Double = js.native
  
  @js.native
  sealed trait NoLeadingSourceMap
    extends StObject
       with EmitFlags
  /* 32 */ val NoLeadingSourceMap: typings.typescript.mod.EmitFlags.NoLeadingSourceMap & Double = js.native
  
  @js.native
  sealed trait NoNestedComments
    extends StObject
       with EmitFlags
  /* 4096 */ val NoNestedComments: typings.typescript.mod.EmitFlags.NoNestedComments & Double = js.native
  
  @js.native
  sealed trait NoNestedSourceMaps
    extends StObject
       with EmitFlags
  /* 128 */ val NoNestedSourceMaps: typings.typescript.mod.EmitFlags.NoNestedSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoSourceMap
    extends StObject
       with EmitFlags
  /* 96 */ val NoSourceMap: typings.typescript.mod.EmitFlags.NoSourceMap & Double = js.native
  
  @js.native
  sealed trait NoSubstitution
    extends StObject
       with EmitFlags
  /* 8 */ val NoSubstitution: typings.typescript.mod.EmitFlags.NoSubstitution & Double = js.native
  
  @js.native
  sealed trait NoTokenLeadingSourceMaps
    extends StObject
       with EmitFlags
  /* 256 */ val NoTokenLeadingSourceMaps: typings.typescript.mod.EmitFlags.NoTokenLeadingSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTokenSourceMaps
    extends StObject
       with EmitFlags
  /* 768 */ val NoTokenSourceMaps: typings.typescript.mod.EmitFlags.NoTokenSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTokenTrailingSourceMaps
    extends StObject
       with EmitFlags
  /* 512 */ val NoTokenTrailingSourceMaps: typings.typescript.mod.EmitFlags.NoTokenTrailingSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTrailingComments
    extends StObject
       with EmitFlags
  /* 2048 */ val NoTrailingComments: typings.typescript.mod.EmitFlags.NoTrailingComments & Double = js.native
  
  @js.native
  sealed trait NoTrailingSourceMap
    extends StObject
       with EmitFlags
  /* 64 */ val NoTrailingSourceMap: typings.typescript.mod.EmitFlags.NoTrailingSourceMap & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EmitFlags
  /* 0 */ val None: typings.typescript.mod.EmitFlags.None & Double = js.native
  
  @js.native
  sealed trait ReuseTempVariableScope
    extends StObject
       with EmitFlags
  /* 1048576 */ val ReuseTempVariableScope: typings.typescript.mod.EmitFlags.ReuseTempVariableScope & Double = js.native
  
  @js.native
  sealed trait SingleLine
    extends StObject
       with EmitFlags
  /* 1 */ val SingleLine: typings.typescript.mod.EmitFlags.SingleLine & Double = js.native
}
