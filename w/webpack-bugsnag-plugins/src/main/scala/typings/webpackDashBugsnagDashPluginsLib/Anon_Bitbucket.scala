package typings
package webpackDashBugsnagDashPluginsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitbucket extends js.Object {
  /**
    *  The source control provider.
    */
  var provider: webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.github | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`github-enterprise` | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.gitlab | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`gitlab-onpremise` | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.bitbucket | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`bitbucket-server`
  /**
    * A URL (git/ssh/https) pointing to the repository, or webpage representing
    * the repository
    */
  var repository: java.lang.String
  /**
    * The unique identifier for the commit (e.g. git SHA)
    */
  var revision: java.lang.String
}

object Anon_Bitbucket {
  @scala.inline
  def apply(
    provider: webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.github | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`github-enterprise` | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.gitlab | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`gitlab-onpremise` | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.bitbucket | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.`bitbucket-server`,
    repository: java.lang.String,
    revision: java.lang.String
  ): Anon_Bitbucket = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository, revision = revision)
  
    __obj.asInstanceOf[Anon_Bitbucket]
  }
}

