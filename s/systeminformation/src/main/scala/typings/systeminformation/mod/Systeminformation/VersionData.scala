package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends js.Object {
  var docker: js.UndefOr[String] = js.undefined
  var dotnet: js.UndefOr[String] = js.undefined
  var gcc: js.UndefOr[String] = js.undefined
  var git: js.UndefOr[String] = js.undefined
  var grunt: js.UndefOr[String] = js.undefined
  var gulp: js.UndefOr[String] = js.undefined
  @JSName("java")
  var java_ : js.UndefOr[String] = js.undefined
  var kernel: js.UndefOr[String] = js.undefined
  var mongodb: js.UndefOr[String] = js.undefined
  var mysql: js.UndefOr[String] = js.undefined
  var nginx: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String] = js.undefined
  var npm: js.UndefOr[String] = js.undefined
  var openssl: js.UndefOr[String] = js.undefined
  var perl: js.UndefOr[String] = js.undefined
  var php: js.UndefOr[String] = js.undefined
  var pip: js.UndefOr[String] = js.undefined
  var pip3: js.UndefOr[String] = js.undefined
  var pm2: js.UndefOr[String] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var postgresql: js.UndefOr[String] = js.undefined
  var python: js.UndefOr[String] = js.undefined
  var python3: js.UndefOr[String] = js.undefined
  var redis: js.UndefOr[String] = js.undefined
  var systemOpenssl: js.UndefOr[String] = js.undefined
  var systemOpensslLib: js.UndefOr[String] = js.undefined
  var tsc: js.UndefOr[String] = js.undefined
  var v8: js.UndefOr[String] = js.undefined
  var virtualbox: js.UndefOr[String] = js.undefined
  var yarn: js.UndefOr[String] = js.undefined
}

object VersionData {
  @scala.inline
  def apply(
    docker: String = null,
    dotnet: String = null,
    gcc: String = null,
    git: String = null,
    grunt: String = null,
    gulp: String = null,
    java_ : String = null,
    kernel: String = null,
    mongodb: String = null,
    mysql: String = null,
    nginx: String = null,
    node: String = null,
    npm: String = null,
    openssl: String = null,
    perl: String = null,
    php: String = null,
    pip: String = null,
    pip3: String = null,
    pm2: String = null,
    postfix: String = null,
    postgresql: String = null,
    python: String = null,
    python3: String = null,
    redis: String = null,
    systemOpenssl: String = null,
    systemOpensslLib: String = null,
    tsc: String = null,
    v8: String = null,
    virtualbox: String = null,
    yarn: String = null
  ): VersionData = {
    val __obj = js.Dynamic.literal()
    if (docker != null) __obj.updateDynamic("docker")(docker.asInstanceOf[js.Any])
    if (dotnet != null) __obj.updateDynamic("dotnet")(dotnet.asInstanceOf[js.Any])
    if (gcc != null) __obj.updateDynamic("gcc")(gcc.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (grunt != null) __obj.updateDynamic("grunt")(grunt.asInstanceOf[js.Any])
    if (gulp != null) __obj.updateDynamic("gulp")(gulp.asInstanceOf[js.Any])
    if (java_ != null) __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    if (mongodb != null) __obj.updateDynamic("mongodb")(mongodb.asInstanceOf[js.Any])
    if (mysql != null) __obj.updateDynamic("mysql")(mysql.asInstanceOf[js.Any])
    if (nginx != null) __obj.updateDynamic("nginx")(nginx.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (npm != null) __obj.updateDynamic("npm")(npm.asInstanceOf[js.Any])
    if (openssl != null) __obj.updateDynamic("openssl")(openssl.asInstanceOf[js.Any])
    if (perl != null) __obj.updateDynamic("perl")(perl.asInstanceOf[js.Any])
    if (php != null) __obj.updateDynamic("php")(php.asInstanceOf[js.Any])
    if (pip != null) __obj.updateDynamic("pip")(pip.asInstanceOf[js.Any])
    if (pip3 != null) __obj.updateDynamic("pip3")(pip3.asInstanceOf[js.Any])
    if (pm2 != null) __obj.updateDynamic("pm2")(pm2.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (postgresql != null) __obj.updateDynamic("postgresql")(postgresql.asInstanceOf[js.Any])
    if (python != null) __obj.updateDynamic("python")(python.asInstanceOf[js.Any])
    if (python3 != null) __obj.updateDynamic("python3")(python3.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis.asInstanceOf[js.Any])
    if (systemOpenssl != null) __obj.updateDynamic("systemOpenssl")(systemOpenssl.asInstanceOf[js.Any])
    if (systemOpensslLib != null) __obj.updateDynamic("systemOpensslLib")(systemOpensslLib.asInstanceOf[js.Any])
    if (tsc != null) __obj.updateDynamic("tsc")(tsc.asInstanceOf[js.Any])
    if (v8 != null) __obj.updateDynamic("v8")(v8.asInstanceOf[js.Any])
    if (virtualbox != null) __obj.updateDynamic("virtualbox")(virtualbox.asInstanceOf[js.Any])
    if (yarn != null) __obj.updateDynamic("yarn")(yarn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionData]
  }
}

