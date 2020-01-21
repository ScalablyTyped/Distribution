package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends js.Object {
  var docker: String
  var gcc: String
  var git: String
  var grunt: String
  var gulp: String
  @JSName("java")
  var java_ : String
  var kernel: String
  var mongodb: String
  var mysql: String
  var nginx: String
  var node: String
  var npm: String
  var openssl: String
  var perl: String
  var php: String
  var pip: String
  var pip3: String
  var pm2: String
  var postfix: String
  var postgresql: String
  var python: String
  var python3: String
  var redis: String
  var systemOpenssl: String
  var systemOpensslLib: String
  var tsc: String
  var v8: String
  var virtualbox: String
  var yarn: String
}

object VersionData {
  @scala.inline
  def apply(
    docker: String,
    gcc: String,
    git: String,
    grunt: String,
    gulp: String,
    java_ : String,
    kernel: String,
    mongodb: String,
    mysql: String,
    nginx: String,
    node: String,
    npm: String,
    openssl: String,
    perl: String,
    php: String,
    pip: String,
    pip3: String,
    pm2: String,
    postfix: String,
    postgresql: String,
    python: String,
    python3: String,
    redis: String,
    systemOpenssl: String,
    systemOpensslLib: String,
    tsc: String,
    v8: String,
    virtualbox: String,
    yarn: String
  ): VersionData = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any], gcc = gcc.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], grunt = grunt.asInstanceOf[js.Any], gulp = gulp.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any], mysql = mysql.asInstanceOf[js.Any], nginx = nginx.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], perl = perl.asInstanceOf[js.Any], php = php.asInstanceOf[js.Any], pip = pip.asInstanceOf[js.Any], pip3 = pip3.asInstanceOf[js.Any], pm2 = pm2.asInstanceOf[js.Any], postfix = postfix.asInstanceOf[js.Any], postgresql = postgresql.asInstanceOf[js.Any], python = python.asInstanceOf[js.Any], python3 = python3.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any], systemOpenssl = systemOpenssl.asInstanceOf[js.Any], systemOpensslLib = systemOpensslLib.asInstanceOf[js.Any], tsc = tsc.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], virtualbox = virtualbox.asInstanceOf[js.Any], yarn = yarn.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionData]
  }
}

