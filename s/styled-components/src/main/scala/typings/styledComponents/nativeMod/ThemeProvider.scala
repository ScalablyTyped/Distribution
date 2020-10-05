package typings.styledComponents.nativeMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ]) = this()
  def this(
    props: ThemeProviderProps[
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ],
    context: js.Any
  ) = this()
}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[
      ThemeProviderComponent[
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme], 
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]
      ]
    ]

