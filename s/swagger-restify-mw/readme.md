
# Scala.js typings for swagger-restify-mw

Typings are for version 0.7

## Library description:
Swagger loader and middleware for Restify

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-restify-mw |
| Keywords           | swagger, api, apis, restify |
| # releases         | 1 |
| # dependents       | 5 |
| # downloads        | 30184 |
| # stars            | 2 |

## Links
- [Homepage](https://github.com/apigee-127/swagger-restify#readme)
- [Bugs](https://github.com/apigee-127/swagger-restify/issues)
- [Repository](https://github.com/apigee-127/swagger-restify)
- [Npm](https://www.npmjs.com/package/swagger-restify-mw)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-restify-mw 0.7
// Project: https://github.com/apigee-127/swagger-restify#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================
import * as SwaggerRestify from "swagger-restify-mw";
import * as restify from "restify";

let app = restify.createServer();

let config = {
  appRoot: __dirname // required config
} as SwaggerRestify.Config;

SwaggerRestify.create(config, function(err, swaggerRestify) {
  if (err) { throw err; }

  swaggerRestify.register(app);

  let port = process.env.PORT || 10010;
  app.listen(port);

  if (swaggerRestify.runner.swagger.paths['/hello']) {
    console.log('try this:\ncurl http://127.0.0.1:' + port + '/hello?name=Scott');
  }
});

 =============================================== */


```

